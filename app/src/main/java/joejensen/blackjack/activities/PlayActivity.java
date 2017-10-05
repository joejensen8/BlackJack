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
    private static Settings settings;

    private Button hitButton;
    private Button standButton;
    private Button splitButton;
    private Button doubleDownButton;
    private Button changeBetButton;


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
        hitButton = (Button) findViewById(R.id.hit_button);
        standButton = (Button) findViewById(R.id.stand_button);
        splitButton = (Button) findViewById(R.id.split_button);
        doubleDownButton = (Button) findViewById(R.id.double_down_button);
        changeBetButton = (Button) findViewById(R.id.change_bet_button);

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

    }

    private void onStand() {

    }

    private void onDoubleDown() {

    }

    private void onSplit() {

    }

    private void onChangeBet() {

    }
}
