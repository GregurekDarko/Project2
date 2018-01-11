package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int portugalGoal = 0;
    int franceGoal = 0;

    int portugalFaul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    /**
     * Add one Goal for Portugal.
     */


   public void addGoalPortugal (View V){
        portugalGoal = portugalGoal +1;
        displayPortugalScore(portugalGoal);


   }

    /**
     * Add one Goal for France.
     */
    public void addGoalFrance (View V){
        franceGoal = franceGoal +1;
        displayFranceScore(franceGoal);


    }

    public void addFaulPortugal (View V){
        portugalFaul = portugalFaul +1;
        displayPortugalFaul(portugalFaul);


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
     * Display faul for Portugal.
     */
    public void displayPortugalFaul(int faul) {
        TextView scoreView = (TextView) findViewById(R.id.num_of_fauls_pt);
        scoreView.setText(String.valueOf(faul));
    }



}
