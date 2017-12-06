package schwirian.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Button top_left, top_mid, top_right,
            mid_left, mid_mid, mid_right,
            bot_left, bot_mid, bot_right,
            reset_button;
    TextView turn;
    boolean is_x, winner, draw;
    boolean tlc, tmc, trc, mlc, mmc, mrc, blc, bmc, brc;
    Button[][] but_array = new Button[3][3];
    int turn_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        tlc = tmc = trc = mlc = mmc = mrc = blc = bmc = brc = false;

        is_x = true;

        winner = draw = false;

        turn_count = 0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        top_left = (Button) findViewById(R.id.top_left);
        top_mid = (Button) findViewById(R.id.top_mid);
        top_right = (Button) findViewById(R.id.top_right);
        mid_left = (Button) findViewById(R.id.mid_left);
        mid_mid = (Button) findViewById(R.id.mid_mid);
        mid_right = (Button) findViewById(R.id.mid_right);
        bot_left = (Button) findViewById(R.id.bot_left);
        bot_mid = (Button) findViewById(R.id.bot_mid);
        bot_right = (Button) findViewById(R.id.bot_right);

        reset_button = (Button) findViewById(R.id.reset_button);

        but_array[0][0] = top_left;
        but_array[0][1] = top_mid;
        but_array[0][2] = top_right;
        but_array[1][0] = mid_left;
        but_array[1][1] = mid_mid;
        but_array[1][2] = mid_right;
        but_array[2][0] = bot_left;
        but_array[2][1] = bot_mid;
        but_array[2][2] = bot_right;

        turn = (TextView) findViewById(R.id.turn);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                but_array[i][j].setText("");
            }
        }

        top_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tlc && !winner && !draw) {
                    tlc = true;
                    top_left.setText(is_x ? "X" : "O");
                    turn_count += 1;
                    if (check(is_x ? "X" : "O")) {
                        String turn_text = "Winner: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                        winner = true;
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    else if (turn_count == 9) {
                        draw = true;
                        turn.setText("Draw");
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    if (!winner && !draw) {
                        is_x = !is_x;
                        String turn_text = "Turn: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                    }
                }
            }
        });
        top_mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tmc && !winner && !draw) {
                    tmc = true;
                    top_mid.setText(is_x ? "X" : "O");
                    turn_count += 1;
                    if (check(is_x ? "X" : "O")) {
                        String turn_text = "Winner: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                        winner = true;
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    else if (turn_count == 9) {
                        draw = true;
                        turn.setText("Draw");
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    if (!winner && !draw) {
                        is_x = !is_x;
                        String turn_text = "Turn: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                    }
                }
            }
        });
        top_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!trc && !winner && !draw) {
                    trc = true;
                    top_right.setText(is_x ? "X" : "O");
                    turn_count += 1;
                    if (check(is_x ? "X" : "O")) {
                        String turn_text = "Winner: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                        winner = true;
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    else if (turn_count == 9) {
                        draw = true;
                        turn.setText("Draw");
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    if (!winner && !draw) {
                        is_x = !is_x;
                        String turn_text = "Turn: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                    }
                }
            }
        });
        mid_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mlc && !winner && !draw) {
                    mlc = true;
                    mid_left.setText(is_x ? "X" : "O");
                    turn_count += 1;
                    if (check(is_x ? "X" : "O")) {
                        String turn_text = "Winner: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                        winner = true;
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    else if (turn_count == 9) {
                        draw = true;
                        turn.setText("Draw");
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    if (!winner && !draw) {
                        is_x = !is_x;
                        String turn_text = "Turn: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                    }
                }
            }
        });
        mid_mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mmc && !winner && !draw) {
                    mmc = true;
                    mid_mid.setText(is_x ? "X" : "O");
                    turn_count += 1;
                    if (check(is_x ? "X" : "O")) {
                        String turn_text = "Winner: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                        winner = true;
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    else if (turn_count == 9) {
                        draw = true;
                        turn.setText("Draw");
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    if (!winner && !draw) {
                        is_x = !is_x;
                        String turn_text = "Turn: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                    }
                }
            }
        });
        mid_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mrc && !winner && !draw) {
                    mrc = true;
                    mid_right.setText(is_x ? "X" : "O");
                    turn_count += 1;
                    if (check(is_x ? "X" : "O")) {
                        String turn_text = "Winner: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                        winner = true;
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    else if (turn_count == 9) {
                        draw = true;
                        turn.setText("Draw");
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    if (!winner && !draw) {
                        is_x = !is_x;
                        String turn_text = "Turn: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                    }
                }
            }
        });
        bot_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!blc && !winner && !draw) {
                    blc = true;
                    bot_left.setText(is_x ? "X" : "O");
                    turn_count += 1;
                    if (check(is_x ? "X" : "O")) {
                        String turn_text = "Winner: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                        winner = true;
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    else if (turn_count == 9) {
                        draw = true;
                        turn.setText("Draw");
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    if (!winner && !draw) {
                        is_x = !is_x;
                        String turn_text = "Turn: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                    }
                }
            }
        });
        bot_mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!bmc && !winner && !draw) {
                    bmc = true;
                    bot_mid.setText(is_x ? "X" : "O");
                    turn_count += 1;
                    if (check(is_x ? "X" : "O")) {
                        String turn_text = "Winner: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                        winner = true;
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    else if (turn_count == 9) {
                        draw = true;
                        turn.setText("Draw");
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    if (!winner && !draw) {
                        is_x = !is_x;
                        String turn_text = "Turn: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                    }
                }
            }
        });
        bot_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!brc && !winner && !draw) {
                    brc = true;
                    bot_right.setText(is_x ? "X" : "O");
                    turn_count += 1;
                    if (check(is_x ? "X" : "O")) {
                        String turn_text = "Winner: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                        winner = true;
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    else if (turn_count == 9) {
                        draw = true;
                        turn.setText("Draw");
                        reset_button.setVisibility(View.VISIBLE);
                    }
                    if (!winner && !draw) {
                        is_x = !is_x;
                        String turn_text = "Turn: " + (is_x ? "X" : "O");
                        turn.setText(turn_text);
                    }
                }
            }
        });

        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (reset_button.getVisibility() == View.VISIBLE) {
                    is_x = true;
                    winner = draw = false;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            but_array[i][j].setText("");
                        }
                    }
                    turn.setText("Turn: X");
                    reset_button.setVisibility(View.INVISIBLE);
                    tlc = tmc = trc = mlc = mmc = mrc = blc = bmc = brc = false;
                }
            }
        });
    }

    public boolean check(String player) {

        if (checkRows(player) || checkCols(player) || checkDiags(player)) {
            return true;
        }

        return false;
    }

    public boolean checkRows(String player) {

        boolean win;
        for (int i = 0; i < 3; i++) {
            win = true;
            for (int j = 0; j < 3; j++) {
                if (but_array[i][j].getText() != player) {
                    win = false;
                }
            }
            if (win) {
                return true;
            }
        }

        return false;
    }

    public boolean checkCols(String player) {

        boolean win;
        for (int i = 0; i < 3; i++) {
            win = true;
            for (int j = 0; j < 3; j++) {
                if (but_array[j][i].getText() != player) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }

        return false;
    }

    public boolean checkDiags(String player) {

        boolean win;
        win = true;
        int i, j;
        for (i = 0, j = 0; (i < 3) && (j < 3); i++, j++) {
            if (but_array[i][j].getText() != player) {
                win = false;
                break;
            }
        }
        if (win) {
            return true;
        }

        win = true;
        for (i = 2, j = 0; (i >= 0) && (j < 3); i--, j++) {
            if (but_array[i][j].getText() != player) {
                win = false;
                break;
            }
        }
        if (win) {
            return true;
        }

        return false;
    }

    public void reset() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                but_array[i][j].setText("");
            }
        }
    }
}
