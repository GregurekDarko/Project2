package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final String STATE_GOAL_PORTUGAL = "portugalGoal";
    static final String STATE_GOAL_FRANCE = "franceGoal";

    static final String STATE_FAUL_PORTUGAL = "portugalFaul";
    static final String STATE_FOUL_FRANCE = "franceFoul";

    int portugalGoal = 0;
    int franceGoal = 0;

    int portugalFaul = 0;
    int franceFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_GOAL_PORTUGAL, portugalGoal);
        savedInstanceState.putInt(STATE_GOAL_FRANCE, franceGoal);

        savedInstanceState.putInt(STATE_FAUL_PORTUGAL, portugalFaul);
        savedInstanceState.putInt(STATE_FOUL_FRANCE, franceFoul);

        super.onSaveInstanceState(savedInstanceState);
    }

    /**
     * Maintaining score and fouls when screen changes oriantation
     */
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        portugalGoal = savedInstanceState.getInt(STATE_GOAL_PORTUGAL);
        franceGoal = savedInstanceState.getInt(STATE_GOAL_FRANCE);
        portugalFaul = savedInstanceState.getInt(STATE_FAUL_PORTUGAL);
        franceFoul = savedInstanceState.getInt(STATE_FOUL_FRANCE);

        displayPortugalScore(portugalGoal);
        displayFranceScore(franceGoal);
        displayPortugalFaul(portugalFaul);
        displayFranceFaul(franceFoul);
    }

    /**
     * Add one Goal for Portugal.
     */


    public void addGoalPortugal(View V) {
        portugalGoal = portugalGoal + 1;
        displayPortugalScore(portugalGoal);


    }

    /**
     * Add one Goal for France.
     */
    public void addGoalFrance(View V) {
        franceGoal = franceGoal + 1;
        displayFranceScore(franceGoal);


    }

    /**
     * Add one Foul for Portugal.
     */
    public void addFaulPortugal(View V) {
        portugalFaul = portugalFaul + 1;
        displayPortugalFaul(portugalFaul);


    }

    /**
     * Add one Foul for France.
     */
    public void addFranceFoul(View V) {
        franceFoul = franceFoul + 1;
        displayFranceFaul(franceFoul);


    }


    /**
     * Display score for Portugal.
     */
    public void displayPortugalScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.portugal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display score for France.
     */
    public void displayFranceScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.france_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display fouls for Portugal.
     */
    public void displayPortugalFaul(int faul) {
        TextView scoreView = (TextView) findViewById(R.id.num_of_fauls_pt);
        scoreView.setText(String.valueOf(faul));
    }

    /**
     * Display fouls for France.
     */
    public void displayFranceFaul(int faul) {
        TextView scoreView = (TextView) findViewById(R.id.num_of_fauls_fr);
        scoreView.setText(String.valueOf(faul));
    }

    /**
     * Reseting all
     */

    public void resetAll(View v) {
        portugalGoal = 0;
        displayPortugalScore(portugalGoal);
        franceGoal = 0;
        displayFranceScore(franceGoal);
        portugalFaul = 0;
        displayPortugalFaul(portugalFaul);
        franceFoul = 0;
        displayFranceFaul(franceFoul);
    }

}
