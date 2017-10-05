package joejensen.blackjack.models;

import joejensen.blackjack.enums.Payout;

public class Settings {

    private Payout payout;

    public Settings() {
        payout = Payout.THREE_TO_TWO;
    }

    public Payout getPayout() {
        return this.payout;
    }

}
