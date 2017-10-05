package joejensen.blackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class PlayActivity extends AppCompatActivity {

    private Game game;
    private static Settings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Toolbar playToolbar = (Toolbar) findViewById(R.id.play_toolbar);
        setSupportActionBar(playToolbar);

        game = new Game();
    }

    private void initButtons() {

    }

}
