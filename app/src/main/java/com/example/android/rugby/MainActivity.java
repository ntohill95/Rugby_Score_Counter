package com.example.android.rugby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int totalScore = 0;
    private static int totalScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(totalScore);
        displayForTeamB(totalScoreB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void kick(View view){
        totalScore += 3;
        displayForTeamA(totalScore);
    }
    public void con(View view){
        totalScore += 2;
        displayForTeamA(totalScore);
    }
    public void atry(View view){
        totalScore += 5;
        displayForTeamA(totalScore);
    }
    public void kickb(View view){
        totalScoreB += 3;
        displayForTeamB(totalScoreB);
    }
    public void conb(View view){
        totalScoreB += 2;
        displayForTeamB(totalScoreB);
    }
    public void atryb(View view){
        totalScoreB += 5;
        displayForTeamB(totalScoreB);
    }

    public void resetButton(View view){
        totalScore=0;
        totalScoreB=0;
        displayForTeamA(totalScore);
        displayForTeamB(totalScoreB);
    }
}
