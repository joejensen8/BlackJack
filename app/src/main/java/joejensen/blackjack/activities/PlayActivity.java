package joejensen.blackjack.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import joejensen.blackjack.R;
import joejensen.blackjack.models.Settings;
import joejensen.blackjack.models.Game;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {

    private Game game;
    //private static Settings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Toolbar playToolbar = (Toolbar) findViewById(R.id.play_toolbar);
        setSupportActionBar(playToolbar);

        initButtons();
        game = new Game();
    }

    private void initButtons() {
        Button hitButton = (Button) findViewById(R.id.hit_button);
        Button standButton = (Button) findViewById(R.id.stand_button);
        Button splitButton = (Button) findViewById(R.id.split_button);
        Button doubleDownButton = (Button) findViewById(R.id.double_down_button);
        Button changeBetButton = (Button) findViewById(R.id.change_bet_button);

        hitButton.setOnClickListener(this);
        standButton.setOnClickListener(this);
        splitButton.setOnClickListener(this);
        doubleDownButton.setOnClickListener(this);
        changeBetButton.setOnClickListener(this);
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

    public void setButtonVisibility() {

    }
}
