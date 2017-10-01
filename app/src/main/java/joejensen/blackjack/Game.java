package joejensen.blackjack;

public class Game {

    private Dealer dealer;
    private Player player;
    private Deck deck;

    public Game() {
        this(6);
    }

    public Game(int numDecks) {
        this.player = new Player();
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
    }

    private void givePlayerCard() {
        player.getHand().giveCard(deck.getNext());
    }

    private void giveDealerCard(boolean isFaceDown) {
        dealer.getHand().giveCard(deck.getNext());
    }

}
