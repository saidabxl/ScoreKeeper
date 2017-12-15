package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int goalsTeamA = 0;
    int goalsTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;
    int teamAPenalty = 0 ;
    int teamBPenalty = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the given goals for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given goals for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Add Goals for Team A
     */
    public void goalsTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayForTeamA(goalsTeamA);
    }


    /**
     * Add Goals for Team B
     */
    public void goalForTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayForTeamB(goalsTeamB);
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void yellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given yellow cards for Team B.
     */
    public void yellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Add Yellow Card for Team A
     */
    public void yellowCardForTeamA(View v) {
        yellowCardTeamA = yellowCardTeamA + 1;
        yellowForTeamA(yellowCardTeamA);
    }

    /**
     * Add Yellow Card for Team B
     */
    public void yellowCardForTeamB(View v) {
        yellowCardTeamB = yellowCardTeamB + 1;
        yellowForTeamB(yellowCardTeamB);
    }


    /**
     * Displays the given red cards for Team A.
     */
    public void redForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red cards for Team B.
     */
    public void redForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(score));
    }


    /**
     *  Add red card for Team A
     */
    public void redCardForTeamA(View v) {
        redCardTeamA = redCardTeamA + 1;
        redForTeamA(redCardTeamA);
    }


    /**
     * Add red card for Team B
     */
    public void redCardForTeamB(View v) {
        redCardTeamB = redCardTeamB + 1;
        redForTeamB(redCardTeamB);
    }


    /**
     * Add Penalty Card for Team A
     */
    public void teamAPenalty(View v) {
        teamAPenalty = teamAPenalty + 1;
        teamAPenalty(teamAPenalty);
    }

    /**
     * Add Penalty for Team B
     */
    public void teamBPenalty(View v) {
        teamBPenalty = teamBPenalty + 1;
        teamBPenalty(teamBPenalty);
    }


    /**
     * Displays the Penalty Team A.
     */
    public void teamAPenalty(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the Penalty Team A.
     */
    public void teamBPenalty(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalty);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method reset all points and all games when the reset all button click.
     */
    public void resetScore(View v) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        teamAPenalty = 0;
        teamBPenalty = 0;

        displayForTeamA(0);
        displayForTeamB(0);
        yellowForTeamA(0);
        yellowForTeamB(0);
        redForTeamA(0);
        redForTeamB(0);
        teamAPenalty(0);
        teamBPenalty(0);

    }
}