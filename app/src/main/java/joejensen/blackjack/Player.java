package joejensen.blackjack;

public class Player extends BasePlayer {

    private Dollars dollars;
    private Dollars continualBet;
    private Dollars currentBet;

    public Player() {
        super();
    }

    public void changeContinualBet(Dollars dollars) {
        this.continualBet = dollars;
    }

    public void setBet(Dollars d) {
        dollars.subtract(d);
        currentBet = d;
    }

    public void determinePayout(boolean playerWon, boolean playerPushed) {
        
    }

}
