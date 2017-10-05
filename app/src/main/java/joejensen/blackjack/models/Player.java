package joejensen.blackjack.models;

import joejensen.blackjack.enums.HandResult;
import joejensen.blackjack.enums.Payout;

public class Player extends BasePlayer {

    private Dollars dollars;
    private Dollars continualBet;
    private Dollars currentBet;

    public Player() {
        this(0);
    }

    public Player(int entryCash) {
        super();
        dollars = new Dollars(entryCash);
    }

    public void changeContinualBet(Dollars dollars) {
        this.continualBet = dollars;
    }

    public void setBet() {
        currentBet = new Dollars(continualBet.getValue());
        dollars.subtract(currentBet);
    }

    public void givePayout(HandResult handResult, Payout payout) {
        switch (handResult) {
            case BLACKJACK:
                dollars.add(Payout.getBlackJackExtraWinnings(currentBet, payout));
                dollars.add(currentBet).add(currentBet);
                break;
            case WON:
                dollars.add(currentBet).add(currentBet);
                break;
            case PUSH:
                dollars.add(currentBet);
                break;
        }
        currentBet.clear();
    }

}
