package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    /**
     * Define a String Variable for User Input
     */
    int goalsTeamA = 0;
    int goalsTeamB = 0;
    int teamAPenalty = 0;
    int teamBPenalty = 0;
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;



    //declare a final static variable for key


    public static final String KEY_goalsTeamA = "KEY_goalsTeamA";
    public static final String KEY_goalsTeamB = "KEY_goalsTeamB";
    public static final String KEY_teamAPenalty = "KEY_teamAPenalty";
    public static final String KEY_teamBPenalty = "KEY_teamBPenalty";
    public static final String KEY_yellowCardTeamA = "KEY_yellowCardTeamA";
    public static final String KEY_yellowCardTeamB = "KEY_yellowCardTeamB";
    public static final String KEY_redCardTeamA = "KEY_redCardTeamA";
    public static final String KEY_redCardTeamB = "KEY_redCardTeamB";

    //use that key while saving the data to savedInstance

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(KEY_goalsTeamA, goalsTeamA);
        savedInstanceState.putInt(KEY_goalsTeamB, goalsTeamB);
        savedInstanceState.putInt(KEY_teamAPenalty, teamAPenalty);
        savedInstanceState.putInt(KEY_teamBPenalty, teamBPenalty);
        savedInstanceState.putInt(KEY_yellowCardTeamA, yellowCardTeamA);
        savedInstanceState.putInt(KEY_yellowCardTeamB, yellowCardTeamB);
        savedInstanceState.putInt(KEY_redCardTeamA, redCardTeamA);
        savedInstanceState.putInt(KEY_redCardTeamB, redCardTeamB);
    }


    //use the same key to retrieve the data back

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int goalsTeamA = savedInstanceState.getInt(KEY_goalsTeamA);
        int goalsTeamB = savedInstanceState.getInt(KEY_goalsTeamB);
        int teamAPenalty = savedInstanceState.getInt(KEY_teamBPenalty);
        int teamBPenalty = savedInstanceState.getInt(KEY_teamBPenalty);
        int yellowCardTeamA = savedInstanceState.getInt(KEY_yellowCardTeamA);
        int yellowCardTeamB = savedInstanceState.getInt(KEY_yellowCardTeamB);
        int redCardTeamA = savedInstanceState.getInt(KEY_redCardTeamA);
        int redCardTeamB = savedInstanceState.getInt(KEY_redCardTeamB);

        displayForTeamA(0);
        displayForTeamB(0);
        yellowForTeamA(0);
        yellowForTeamB(0);
        redForTeamA(0);
        redCardForTeamB(0);
        teamAPenalty(0);
        teamBPenalty(0);

    }


    TextView goalsTeamAText;
    TextView goalsTeamBText;
    TextView teamAPenaltyText;
    TextView teamBPenaltyText;
    TextView yellowForTeamAText;
    TextView yellowForTeamBText;
    TextView redForTeamAText;
    TextView redCardForTeamBText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goalsTeamAText = findViewById(R.id.team_a_goal);
        goalsTeamBText = findViewById(R.id.team_b_goal);
        teamAPenaltyText = findViewById(R.id.team_a_penalty);
        teamBPenaltyText = findViewById(R.id.team_b_penalty);
        yellowForTeamAText = findViewById(R.id.team_a_yellow_card);
        yellowForTeamBText = findViewById(R.id.team_b_yellow_card);
        redForTeamAText = findViewById(R.id.team_a_red_card);
        redCardForTeamBText = findViewById(R.id.team_b_red_card);


    }

    /**
     * Add score for Team A
     */
    public void goalsTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayForTeamA(goalsTeamA);

    }

    /**
     * Displays the score for Team A
     */

    public void displayForTeamA(int goalsTeamA) {
        goalsTeamAText.setText(String.valueOf(goalsTeamA));
    }

    /**
     * Add score for Team B
     */
    public void goalForTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayForTeamB(goalsTeamB);
    }

    /**
     * Displays score for Team B
     */
    public void displayForTeamB(int goalForTeamB) {
        goalsTeamBText.setText(String.valueOf(goalForTeamB));
    }

    /**
     * Add Penalty for Team A
     */
    public void teamAPenalty(View v) {
        teamAPenalty = teamAPenalty + 1;
        teamAPenalty(teamAPenalty);
    }


    /**
     * Displays the Penalty for Team A
     */
    public void teamAPenalty(int teamAPenalty) {
        teamAPenaltyText.setText(String.valueOf(teamAPenalty));
    }

    /**
     * Add Penalty for Team B
     */
    public void teamBPenalty(View v) {
        teamBPenalty = teamBPenalty + 1;
        teamBPenalty(teamBPenalty);
    }

    /**
     * Displays the Penalty for Team B
     */
    public void teamBPenalty(int teamBPenalty) {
        teamBPenaltyText.setText(String.valueOf(teamBPenalty));
    }

    /**
     * Add Yellow Card for Team A
     */
    public void yellowCardForTeamA(View v) {
        yellowCardTeamA = yellowCardTeamA + 1;
        yellowForTeamA(yellowCardTeamA);
    }


    /**
     * Displays the given yellow card for Team A
     */
    public void yellowForTeamA(int yellowCardForTeamA) {
        yellowForTeamAText.setText(String.valueOf(yellowCardForTeamA));
    }


    /**
     * Add Yellow Card for Team B
     */
    public void yellowCardForTeamB(View v) {
        yellowCardTeamB = yellowCardTeamB + 1;
        yellowForTeamB(yellowCardTeamB);
    }

    /**
     * Displays the given yellow card for Team B
     */
    public void yellowForTeamB(int yellowCardForTeamB) {
        yellowForTeamBText.setText(String.valueOf(yellowCardForTeamB));
    }

    /**
     * Add red card for Team A
     */
    public void redCardForTeamA(View v) {
        redCardTeamA = redCardTeamA + 1;
        redForTeamA(redCardTeamA);
    }

    /**
     * Displays the given red card for Team A
     */
    public void redForTeamA(int redCardForTeamA) {
        redForTeamAText.setText(String.valueOf(redCardForTeamA));
    }

    /**
     * Add red card for Team B
     */
    public void redCardForTeamB(View v) {
        redCardTeamB = redCardTeamB + 1;
        redCardForTeamB(redCardTeamB);
    }

    /**
     * Displays the given red card for Team B
     */
    public void redCardForTeamB(int redCardForTeamB) {
        redCardForTeamBText.setText(String.valueOf(redCardForTeamB));
    }


    /**
     * Reset all score
     */

    public void resetScore(View v) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        teamAPenalty = 0;
        teamBPenalty = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;

        displayForTeamA(0);
        displayForTeamB(0);
        yellowForTeamA(0);
        yellowForTeamB(0);
        redForTeamA(0);
        redCardForTeamB(0);
        teamAPenalty(0);
        teamBPenalty(0);



    }
}