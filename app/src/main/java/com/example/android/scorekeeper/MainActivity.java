package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0, faultsTeamA = 0, cornersTeamA = 0, redcardsTeamA= 0;
    int scoreTeamB = 0, faultsTeamB = 0, cornersTeamB = 0, redcardsTeamB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onSaveInstanceState (Bundle outState) {
        outState.putInt("scoreA", scoreTeamA );
        outState.putInt("faultsA", faultsTeamA);
        outState.putInt("cornersA", cornersTeamA);
        outState.putInt("redcardsA", redcardsTeamA);
        outState.putInt("scoreB", scoreTeamB);
        outState.putInt("faultsB", faultsTeamB);
        outState.putInt("cornersB", cornersTeamB);
        outState.putInt("redcardsB", redcardsTeamB);
        super.onSaveInstanceState(outState);
    }
    @Override
    protected void onRestoreInstanceState (Bundle savedInstanceState) {
        scoreTeamA = savedInstanceState.getInt("scoreA");
        faultsTeamA = savedInstanceState.getInt("faultsA");
        cornersTeamA = savedInstanceState.getInt("cornersA");
        redcardsTeamA = savedInstanceState.getInt("redcardsA");
        scoreTeamB = savedInstanceState.getInt("scoreB");
        faultsTeamB = savedInstanceState.getInt("faultsB");
        cornersTeamB = savedInstanceState.getInt("cornersB");
        redcardsTeamB = savedInstanceState.getInt("redcardsB");
        super.onRestoreInstanceState(savedInstanceState);

        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA, redcardsTeamA);
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB, redcardsTeamB);
    }


    /**
     * This method is called when the Team A Goal button is clicked
     */
    public void goalA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA, redcardsTeamA);
    }
    /**
     * This method is called when the Team A Fault button is clicked
     */
    public void faultA(View v) {
        faultsTeamA=faultsTeamA + 1;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA, redcardsTeamA);
    }
    /**
     * This method is called when the Team A Corner button is clicked
     */
    public void cornerA(View v) {
        cornersTeamA = cornersTeamA + 1;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA, redcardsTeamA);
    }

    /**
     * This method is called when the Team A red card button is clicked
     */
    public void redcardA(View v) {
        redcardsTeamA = redcardsTeamA + 1;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA, redcardsTeamA);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score,int faults, int corners, int redcards) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        TextView faultsView = findViewById(R.id.team_a_faults);
        faultsView.setText(String.valueOf(faults));
        TextView cornersView =  findViewById(R.id.team_a_corners);
        cornersView.setText(String.valueOf(corners));
        TextView redcardsView =  findViewById(R.id.team_a_redcards);
        redcardsView.setText(String.valueOf(redcards));
        }
    /**
     * This method is called when the Team B Goal button is clicked
     */
    public void goalB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB, redcardsTeamB);
    }

    /**
     * This method is called when the Team B Fault button is clicked
     */
    public void faultB (View view) {
        faultsTeamB = faultsTeamB + 1;
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB, redcardsTeamB);
    }


    /**
     * This method is called when the Team B Corner button is clicked
     */
    public void cornerB(View view) {
        cornersTeamB = cornersTeamB + 1;
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB, redcardsTeamB);
    }

    /**
     * This method is called when the Team B red card button is clicked
     */
    public void redcardB(View v) {
        redcardsTeamB = redcardsTeamB + 1;
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB, redcardsTeamB);
    }

    /**
     * Displays the given scores for Team B
     */
    public void displayForTeamB(int score,int faults, int corners, int redcards) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
        TextView faultsView = findViewById(R.id.team_b_faults);
        faultsView.setText(String.valueOf(faults));
        TextView cornersView = findViewById(R.id.team_b_corners);
        cornersView.setText(String.valueOf(corners));
        TextView redcardsView =  findViewById(R.id.team_b_redcards);
        redcardsView.setText(String.valueOf(redcards));
    }

    /**
     * This method is called when the Reset button is clicked
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        faultsTeamA = 0;
        cornersTeamA = 0;
        redcardsTeamA = 0;
        scoreTeamB = 0;
        faultsTeamB = 0;
        cornersTeamB = 0;
        redcardsTeamB = 0;
        displayForTeamA(scoreTeamA, faultsTeamA, cornersTeamA, redcardsTeamA);
        displayForTeamB(scoreTeamB, faultsTeamB, cornersTeamB, redcardsTeamB);
    }


}
