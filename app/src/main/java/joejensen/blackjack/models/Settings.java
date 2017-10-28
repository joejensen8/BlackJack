package joejensen.blackjack.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import joejensen.blackjack.R;
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

    public void showSettingsModal(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.settings_modal, null);
    }

}
