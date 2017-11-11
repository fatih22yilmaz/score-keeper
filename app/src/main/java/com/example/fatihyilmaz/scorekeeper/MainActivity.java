package com.example.fatihyilmaz.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goalForTeamA(View view) {
        scoreA += 1;
        TextView textView = findViewById(R.id.scoreTeamA);
        textView.setText("" + scoreA);
    }

    public void goalForTeamB(View view) {
        scoreB += 1;
        TextView textView = findViewById(R.id.scoreTeamB);
        textView.setText("" + scoreB);
    }

    public void resetScores(View view) {
        scoreA = 0;
        scoreB = 0;

        TextView textViewA = findViewById(R.id.scoreTeamA);
        textViewA.setText("" + scoreA);

        TextView textViewB = findViewById(R.id.scoreTeamB);
        textViewB.setText("" + scoreB);

    }
}
