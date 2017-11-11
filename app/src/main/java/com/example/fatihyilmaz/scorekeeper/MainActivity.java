package com.example.fatihyilmaz.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int foulA = 0;
    int foulB = 0;

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
        foulA = 0;
        foulB = 0;

        TextView textViewScoreA = findViewById(R.id.scoreTeamA);
        textViewScoreA.setText("" + scoreA);

        TextView textViewScoreB = findViewById(R.id.scoreTeamB);
        textViewScoreB.setText("" + scoreB);

        TextView textViewFoulA = findViewById(R.id.foulTeamA);
        textViewFoulA.setText("" + foulA);

        TextView textViewFoulB = findViewById(R.id.foulTeamB);
        textViewFoulB.setText("" + foulB);

    }

    public void foulForTeamA(View view) {
        foulA += 1;
        TextView textViewFoulA = findViewById(R.id.foulTeamA);
        textViewFoulA.setText("" + foulA);
    }

    public void foulForTeamB(View view) {
        foulB += 1;
        TextView textViewFoulB = findViewById(R.id.foulTeamB);
        textViewFoulB.setText("" + foulB);
    }
}
