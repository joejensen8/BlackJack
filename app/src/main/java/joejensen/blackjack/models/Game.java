package joejensen.blackjack.models;

import joejensen.blackjack.enums.HandResult;
import joejensen.blackjack.enums.Payout;

public class Game {

    private Dealer dealer;
    private Player player;
    private Deck deck;
    private final Payout PAYOUT = Payout.THREE_TO_TWO; // todo change to settings variable

    public Game() {
        this(6);
    }

    public Game(int numDecks) {
        this.player = new Player(500);
        this.dealer = new Dealer();
        this.deck = new Deck(numDecks);
    }

    public void deal() {
        if (deck.needsReshuffle()) {
            deck.shuffle();
        }
        if (deck.isFreshDeck()) {
            deck.getNext();
        }

        givePlayerCard();
        giveDealerCard(true);
        givePlayerCard();
        giveDealerCard(false);

        if (checkForBlackJacks() != HandResult.INVALID) {
            endHand();
        }
    }

    private void givePlayerCard() {
        player.getHand().giveCard(deck.getNext());
    }

    private void giveDealerCard(boolean isFaceDown) {
        dealer.getHand().giveCard(deck.getNext());
    }

    private HandResult checkForBlackJacks() {
        boolean isPlayerBJ = player.getHand().isBlackJack();
        boolean isDealerBJ = dealer.getHand().isBlackJack();
        if (isDealerBJ && isPlayerBJ) {
            return HandResult.PUSH;
        } else if (isDealerBJ && !isPlayerBJ) {
            return HandResult.LOST;
        } else if (!isDealerBJ && isPlayerBJ) {
            return HandResult.BLACKJACK;
        } else {
            return HandResult.INVALID;
        }
    }

    private void endHand() {
        HandResult handResult = determineWinners();
        player.givePayout(handResult, PAYOUT);
        dealer.getHand().clear();
        player.getHand().clear();
    }

    private HandResult determineWinners() {
        if (checkForBlackJacks() != HandResult.INVALID) {
            return checkForBlackJacks();
        }
        if (player.getHand().isBust()) {
            return HandResult.LOST;
        }
        if (dealer.getHand().isBust()) {
            return HandResult.WON;
        }

        int dealerScore = dealer.getHand().getScore();
        int playerScore = player.getHand().getScore();

        if (dealerScore == playerScore) {
            return HandResult.PUSH;
        } else if (dealerScore > playerScore) {
            return HandResult.LOST;
        } else if (playerScore > dealerScore) {
            return HandResult.WON;
        }

        return HandResult.WON; // default to player winning
    }

    public void playerHit() {

    }

    public void playerStand() {

    }

    public void playerSplit() {

    }

    public void playerDoubleDown() {

    }

    public void playerChangeContinualBet(int dollars) {
        player.changeContinualBet(new Dollars(dollars));
    }

}
