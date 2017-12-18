package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_goalsTeamA;
    public static final String KEY_goalsTeamB;
    public static final String KEY_teamAPenalty;
    public static final String KEY_teamBPenalty;
    public static final String KEY_yellowCardTeamA;
    public static final String KEY_yellowCardTeamB;
    public static final String KEY_redCardTeamA;
    public static final String KEY_redCardTeamB;


    //declare a final static variable for key

    static {
        KEY_goalsTeamA = "goalsTeamA";
    }

    static {
        KEY_goalsTeamB = "goalsTeamB";
    }

    static {
        KEY_teamAPenalty = "teamAPenalty";
    }

    static {
        KEY_teamBPenalty = "teamBPenalty";
    }

    static {
        KEY_yellowCardTeamA = "yellowCardTeamA";
    }

    static {
        KEY_yellowCardTeamB = "yellowCardTeamB";
    }

    static {
        KEY_redCardTeamA = "redCardTeamA";
    }

    static {
        KEY_redCardTeamB = "redCardTeamB";
    }

    /**
     * Define a String Variable for User Input
     */
    int goalsTeamA = 3;
    int goalsTeamB = 2;
    int teamAPenalty = 0;
    int teamBPenalty = 0;
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;


    //use that key while saving the data to savedInstance
    TextView goalsTeamAText;

    //use the same key to retrieve the data back
    TextView goalsTeamBText;
    TextView teamAPenaltyText;
    TextView teamBPenaltyText;
    TextView yellowForTeamAText;
    TextView yellowForTeamBText;
    TextView redForTeamAText;
    TextView redCardForTeamBText;

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
     * Add Goals for TeamA
     */
    public void goalsTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayForTeamA(goalsTeamA);

    }

    /**
     * Displays the given goals for TeamA.
     */

    public void displayForTeamA(int goalsTeamA) {
        goalsTeamAText.setText(String.valueOf(goalsTeamA));
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
    public void displayForTeamB(int goalForTeamB) {
        goalsTeamBText.setText(String.valueOf(goalForTeamB));
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
    public void yellowForTeamA(int yellowCardForTeamA) {
        yellowForTeamAText.setText(String.valueOf(yellowCardForTeamA));
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
    public void yellowForTeamB(int yellowCardForTeamB) {
        yellowForTeamBText.setText(String.valueOf(yellowCardForTeamB));
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
    public void redForTeamA(int redCardForTeamA) {
        redForTeamAText.setText(String.valueOf(redCardForTeamA));
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
    public void redCardForTeamB(int redCardForTeamB) {
        redCardForTeamBText.setText(String.valueOf(redCardForTeamB));
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
    public void teamAPenalty(int teamAPenalty) {
        teamAPenaltyText.setText(String.valueOf(teamAPenalty));
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
    public void teamBPenalty(int teamBPenalty) {
        teamBPenaltyText.setText(String.valueOf(teamBPenalty));
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