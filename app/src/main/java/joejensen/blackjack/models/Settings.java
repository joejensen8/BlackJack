package joejensen.blackjack.models;

public class Settings {

    private Payout payout;

    public Settings() {
        payout = Payout.THREE_TO_TWO;
    }

    public Payout getPayout() {
        return this.payout;
    }

}
