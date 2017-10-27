package joejensen.blackjack.models;

import joejensen.blackjack.activities.PlayActivity;
import joejensen.blackjack.enums.Payout;

// todo make as a preferences class?
public class Settings {

    private Payout payout;

    public Settings() {
        payout = Payout.THREE_TO_TWO;
    }

    public Payout getPayout() {
        return this.payout;
    }

    public void showSettingsModal(PlayActivity activity) {

    }

}
