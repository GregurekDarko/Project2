package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int portugalGoal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void addGoalPortugal (View V){
        portugalGoal = portugalGoal +1;
        displayPortugalScore(portugalGoal);


   }






    /**
     * Display score for Portugal.
     */
    public void displayPortugalScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.portugal_score);
        scoreView.setText(String.valueOf(score));
    }
}
