package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //declare a final static variable for key

    public static final String KEY_goalsTeamA = "goalsTeamA";
    public static final String KEY_goalsTeamB = "goalsTeamB";
    public static final String KEY_teamAPenalty = "teamAPenalty";
    public static final String KEY_teamBPenalty = "teamBPenalty";
    public static final String KEY_yellowCardTeamA = "yellowCardTeamA";
    public static final String KEY_yellowCardTeamB = "yellowCardTeamB";
    public static final String KEY_redCardTeamA = "redCardTeamA";
    public static final String KEY_redCardTeamB = "redCardTeamB";

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
    private TextView goalsTeamAText;
    private TextView goalsTeamBText;
    private TextView teamAPenaltyText;
    private TextView teamBPenaltyText;
    private TextView yellowForTeamAText;
    private TextView yellowForTeamBText;
    private TextView redForTeamAText;
    private TextView redCardForTeamBText;

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

    //use that key while saving the data to savedInstance
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
     * Add Goals for Team A
     */
    public void goalsTeamA(View v) {
        goalsTeamA = goalsTeamA + 1;
        displayForTeamA(goalsTeamA);

    }

    /**
     * Displays the given goals for Team A
     */

    public void displayForTeamA(int goalsTeamA) {
        // TextView scoreView = (goalsTeamAText)findViewById(R.id.team_a_goal);
        goalsTeamAText.setText(String.valueOf(goalsTeamA));
    }

    /**
     * Add Goals for Team B
     */
    public void goalForTeamB(View v) {
        goalsTeamB = goalsTeamB + 1;
        displayForTeamB(goalsTeamB);
    }

    /**
     * Displays the given goals for Team B
     */
    public void displayForTeamB(int goalsTeamB) {
        //TextView scoreView = (goalsTeamBText)findViewById(R.id.team_b_goal);
        goalsTeamBText.setText(String.valueOf(goalsTeamB));
    }


    /**
     * Add Penalty  for Team A
     */
    public void teamAPenalty(View v) {
        teamAPenalty = teamAPenalty + 1;
        teamAPenalty(teamAPenalty);
    }


    /**
     * Displays the Penalty Team A
     */
    public void teamAPenalty(int teamAPenalty) {
        //TextView teamAPenalty = (teamAPenaltyText) findViewById(R.id.team_a_penalty);
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
     * Displays the Penalty Team B
     */
    public void teamBPenalty(int teamBPenalty) {
        //TextView teamBPenalty = (teamBPenaltyText)findViewById(R.id.team_b_penalty);
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
     * Displays the given yellow cards for Team A
     */
    public void yellowForTeamA(int yellowCardTeamA) {
        //TextView scoreView = (yellowForTeamAText)findViewById(R.id.team_a_yellow_card);
        yellowForTeamAText.setText(String.valueOf(yellowCardTeamA));
    }


    /**
     * Add Yellow Card for Team B
     */
    public void yellowCardForTeamB(View v) {
        yellowCardTeamB = yellowCardTeamB + 1;
        yellowForTeamB(yellowCardTeamB);
    }

    /**
     * Displays the given yellow cards for Team B
     */
    public void yellowForTeamB(int yellowForTeamB) {
        //TextView yellowForTeamB = (yellowForTeamBText) findViewById(R.id.team_b_yellow_card);
        yellowForTeamBText.setText(String.valueOf(yellowForTeamB));
    }

    /**
     * Add red card for Team A
     */
    public void redCardForTeamA(View v) {
        redCardTeamA = redCardTeamA + 1;
        redForTeamA(redCardTeamA);
    }

    /**
     * Displays the given red cards for Team A
     */
    public void redForTeamA(int redForTeamA) {
        //TextView redForTeamA = (redForTeamAText) findViewById(R.id.team_a_red_card);
        redForTeamAText.setText(String.valueOf(redForTeamA));
    }

    /**
     * Add red card for Team B
     */
    public void redCardForTeamB(View v) {
        redCardTeamB = redCardTeamB + 1;
        redCardForTeamB(redCardTeamB);
    }

    /**
     * Displays the given red cards for Team B
     */
    public void redCardForTeamB(int redCardForTeamB) {
        //TextView redCardForTeamB = (redCardForTeamBText) findViewById(R.id.team_b_red_card);
        redCardForTeamBText.setText(String.valueOf(redCardForTeamB));
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