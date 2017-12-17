package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int goalsTeamA = 3;
    int goalsTeamB = 2;
    int teamAPenalty = 0;
    int teamBPenalty = 0;
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;


    //declare a final static variable for key

    public static final String KEY_goalsTeamA = "goalsTeamA";
    public static final String KEY_goalsTeamB = "goalsTeamB";
    public static final String KEY_teamAPenalty = "teamAPenalty";
    public static final String KEY_teamBPenalty = "teamBPenalty";
    public static final String KEY_yellowCardTeamA = "yellowCardTeamA";
    public static final String KEY_yellowCardTeamB = "yellowCardTeamB";
    public static final String KEY_redCardTeamA = "redCardTeamA";
    public static final String KEY_redCardTeamB = "redCardTeamB";



    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("goalsTeamA", goalsTeamA);
        savedInstanceState.putInt("goalsTeamB", goalsTeamB);
        savedInstanceState.putInt("teamAPenalty", teamAPenalty);
        savedInstanceState.putInt("teamBPenalty", teamBPenalty);
        savedInstanceState.putInt("yellowCardTeamA", yellowCardTeamA);
        savedInstanceState.putInt("yellowCardTeamB", yellowCardTeamB);
        savedInstanceState.putInt("redCardTeamA", redCardTeamA);
        savedInstanceState.putInt("redCardTeamB", redCardTeamB);
    }

    //use the same key to retrieve the data back

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int goalsTeamA = savedInstanceState.getInt("goalsTeamA");
        int goalsTeamB = savedInstanceState.getInt("goalsTeamB");
        int teamAPenalty = savedInstanceState.getInt("teamAPenalty");
        int teamBPenalty = savedInstanceState.getInt("teamBPenalty");
        int yellowCardTeamA = savedInstanceState.getInt("yellowCardTeamA");
        int yellowCardTeamB = savedInstanceState.getInt("yellowCardTeamB");
        int redCardTeamA = savedInstanceState.getInt("redCardTeamA");
        int redCardTeamB = savedInstanceState.getInt("redCardTeamB");

        displayForTeamA(3);
        displayForTeamB(2);
        yellowForTeamA(0);
        yellowForTeamB(0);
        redForTeamA(0);
        redCardForTeamB(0);
        teamAPenalty(0);
        teamBPenalty(0);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView goalsTeamA = findViewById(R.id.team_a_goal);
        TextView goalsTeamB = findViewById(R.id.team_b_goal);
        TextView teamAPenalty = findViewById(R.id.team_a_penalty);
        TextView teamBPenalty = findViewById(R.id.team_b_penalty);
        TextView yellowForTeamA = findViewById(R.id.team_a_yellow_card);
        TextView yellowForTeamB = findViewById(R.id.team_b_yellow_card);
        TextView redForTeamA = findViewById(R.id.team_a_red_card);
        TextView redCardForTeamB = findViewById(R.id.team_b_red_card);



    }


    /**
     * Add Goals for TeamA
     */
    public void goalsTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayForTeamA(goalsTeamA);

    }

    /**
     * Displays the given goals for TeamA.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add Goals for TeamB
     */
    public void goalForTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayForTeamB(goalsTeamB);
    }

    /**
     * Displays the given goals for TeamB.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add Yellow Card for TeamA
     */
    public void yellowCardForTeamA(View v) {
        yellowCardTeamA = yellowCardTeamA + 1;
        yellowForTeamA(yellowCardTeamA);
    }


    /**
     * Displays the given yellow cards for TeamA.
     */
    public void yellowForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Add Yellow Card for TeamB
     */
    public void yellowCardForTeamB(View v) {
        yellowCardTeamB = yellowCardTeamB + 1;
        yellowForTeamB(yellowCardTeamB);
    }

    /**
     * Displays the given yellow cards for TeamB.
     */
    public void yellowForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add red card for TeamA
     */
    public void redCardForTeamA(View v) {
        redCardTeamA = redCardTeamA + 1;
        redForTeamA(redCardTeamA);
    }

    /**
     * Displays the given red cards for TeamA.
     */
    public void redForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add red card for TeamB
     */
    public void redCardForTeamB(View v) {
        redCardTeamB = redCardTeamB + 1;
        redCardForTeamB(redCardTeamB);
    }

    /**
     * Displays the given red cards for TeamB.
     */
    public void redCardForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Add Penalty Card for TeamA
     */
    public void teamAPenalty(View v) {
        teamAPenalty = teamAPenalty + 1;
        teamAPenalty(teamAPenalty);
    }


    /**
     * Displays the Penalty TeamA.
     */
    public void teamAPenalty(int score) {
        TextView scoreView = findViewById(R.id.team_a_penalty);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add Penalty for TeamB
     */
    public void teamBPenalty(View v) {
        teamBPenalty = teamBPenalty + 1;
        teamBPenalty(teamBPenalty);
    }

    /**
     * Displays the Penalty TeamB.
     */
    public void teamBPenalty(int score) {
        TextView scoreView = findViewById(R.id.team_b_penalty);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Reset all score
     */

    public void resetScore(View v) {
        goalsTeamA = 3;
        goalsTeamB = 2;
        teamAPenalty = 0;
        teamBPenalty = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;

        displayForTeamA(3);
        displayForTeamB(2);
        yellowForTeamA(0);
        yellowForTeamB(0);
        redForTeamA(0);
        redCardForTeamB(0);
        teamAPenalty(0);
        teamBPenalty(0);


    }
}