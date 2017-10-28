package joejensen.blackjack.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import joejensen.blackjack.R;
import joejensen.blackjack.models.Settings;
import joejensen.blackjack.models.Game;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {

    private Game game;
    private Button hitButton;
    private Button standButton;
    private Button splitButton;
    private Button doubleDownButton;
    private Button changeBetButton;
    private TextView bottomTextLeft;
    private TextView bottomTextRight;

    private Settings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Toolbar playToolbar = (Toolbar) findViewById(R.id.play_toolbar);
        setSupportActionBar(playToolbar);
        this.settings = new Settings();

        initButtons();
        this.game = new Game();
    }

    private void initButtons() {
        this.hitButton = (Button) findViewById(R.id.hit_button);
        this.standButton = (Button) findViewById(R.id.stand_button);
        this.splitButton = (Button) findViewById(R.id.split_button);
        this.doubleDownButton = (Button) findViewById(R.id.double_down_button);
        this.changeBetButton = (Button) findViewById(R.id.change_bet_button);
        this.bottomTextLeft = (TextView) findViewById(R.id.bottom_info_text_left);
        this.bottomTextRight = (TextView) findViewById(R.id.bottom_info_text_right);

        this.hitButton.setOnClickListener(this);
        this.standButton.setOnClickListener(this);
        this.splitButton.setOnClickListener(this);
        this.doubleDownButton.setOnClickListener(this);
        this.changeBetButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.hit_button:
                onHit();
                break;
            case R.id.stand_button:
                onStand();
                break;
            case R.id.double_down_button:
                onDoubleDown();
                break;
            case R.id.split_button:
                onSplit();
                break;
            case R.id.change_bet_button:
                onChangeBet();
                break;
            case R.id.toolbar_settings:
                showSettingsPage();
                break;
            case R.id.toolbar_help:
                showHelpPage();
                break;
        }
    }

    private void onHit() {
        game.playerHit();
    }

    private void onStand() {
        game.playerStand();
    }

    private void onDoubleDown() {
        game.playerDoubleDown();
    }

    private void onSplit() {
        game.playerSplit();
    }

    private void onChangeBet() {
        //game.playerChangeContinualBet();
    }

    private void showSettingsPage() {
        settings.showSettingsModal(getApplicationContext());
    }

    private void showHelpPage() {

    }

    public void setButtonVisibility() {

    }

    private void showButtons(boolean showHitButton, boolean showStandButton, boolean showSplitButton,
                             boolean showDoubleDownButton, boolean showChangeBetButton) {

        int hitVisible = showHitButton ? View.VISIBLE : View.GONE;
        int standVisible = showHitButton ? View.VISIBLE : View.GONE;
        int splitVisible = showSplitButton ? View.VISIBLE : View.GONE;
        int doubleDownVisible = showDoubleDownButton ? View.VISIBLE : View.GONE;
        int changeBetVisible = showChangeBetButton ? View.VISIBLE : View.GONE;

        this.hitButton.setVisibility(hitVisible);
        this.standButton.setVisibility(standVisible);
        this.splitButton.setVisibility(splitVisible);
        this.doubleDownButton.setVisibility(doubleDownVisible);
        this.changeBetButton.setVisibility(changeBetVisible);
    }

    private void setBottomTextLeft(String value) {
        bottomTextLeft.setText(value);
    }

    private void setBottomTextRight(String value) {
        bottomTextRight.setText(value);
    }

}
