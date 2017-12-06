package schwirian.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class HomeActivity extends AppCompatActivity {

    Button play_button, about_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        play_button = (Button) findViewById(R.id.play_button);
        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent play_intent = new Intent(HomeActivity.this, GameActivity.class);
                startActivity(play_intent);
            }
        });

        about_button = (Button) findViewById(R.id.about_button);
        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about_intent = new Intent(HomeActivity.this, AboutActivity.class);
                startActivity(about_intent);
            }
        });
    }
}
