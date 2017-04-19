package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int goalsA = 0;
    int foulsA = 0;
    int goalsB = 0;
    int foulsB = 0;


    public void popup(int pop) {
        TextView goalPopupViewA = (TextView) findViewById(R.id.goalPopupA);
        TextView goalPopupViewB = (TextView) findViewById(R.id.goalPopupB);
        TextView foulPopupViewA = (TextView) findViewById(R.id.foulPopupA);
        TextView foulPopupViewB = (TextView) findViewById(R.id.foulPopupB);
        switch (pop){
            case 1: goalPopupViewA.setText(String.valueOf("GOAL!!!"));
                    goalPopupViewB.setText(String.valueOf(""));
                    break;
            case 2: goalPopupViewA.setText(String.valueOf(""));
                    goalPopupViewB.setText(String.valueOf("GOAL!!!"));
                    break;
            case 3: foulPopupViewA.setText(String.valueOf("FOUL!"));
                    foulPopupViewB.setText(String.valueOf(""));
                    break;
            case 4: foulPopupViewA.setText(String.valueOf(""));
                    foulPopupViewB.setText(String.valueOf("FOUL!"));
                    break;
            case 0: goalPopupViewA.setText(String.valueOf(""));
                    goalPopupViewB.setText(String.valueOf(""));
                    foulPopupViewA.setText(String.valueOf(""));
                    foulPopupViewB.setText(String.valueOf(""));
                    break;
        }
    }

    public void displayGoalsForTeamA(int score) {
        TextView goalView = (TextView) findViewById(R.id.displayGoalsA);
        goalView.setText(String.valueOf(score));

    }
    public void displayFoulsForTeamA(int fouls) {
        TextView foulView = (TextView) findViewById(R.id.displayFoulsA);
        foulView.setText(String.valueOf(fouls));
    }

    public void displayGoalsForTeamB(int score) {
        TextView goalView = (TextView) findViewById(R.id.displayGoalsB);
        goalView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamB(int fouls) {
        TextView foulView = (TextView) findViewById(R.id.displayFoulsB);
        foulView.setText(String.valueOf(fouls));
    }

    public void addGoalForA(View v){
        goalsA++;
        displayGoalsForTeamA(goalsA);
        popup(1);
    }

    public void addFoulForA(View v){
        foulsA++;
        displayFoulsForTeamA(foulsA);
        popup(3);
    }

    public void addGoalForB(View v){
        goalsB++;
        displayGoalsForTeamB(goalsB);
        popup(2);
    }

    public void addFoulForB(View v){
        foulsB++;
        displayFoulsForTeamB(foulsB);
        popup(4);
    }

    public void reset(View v){
        goalsA = 0;
        foulsA = 0;
        goalsB = 0;
        foulsB = 0;
        displayGoalsForTeamA(goalsA);
        displayFoulsForTeamA(foulsA);
        displayGoalsForTeamB(goalsB);
        displayFoulsForTeamB(foulsB);
        popup(0);
    }
}
