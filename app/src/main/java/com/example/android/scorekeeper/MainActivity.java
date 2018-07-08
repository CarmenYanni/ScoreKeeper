package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreRealMadrid = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Increase the score by One Goal.
     */
    public void addOneGoalForRealMadrid(View v){
        scoreRealMadrid=scoreRealMadrid+ 1;
        displayGoalForRealMadrid(scoreRealMadrid);
    }
    /**
     * Increase the score by One Foul.
     */
    public void addOneFoulForRealMadrid(View v){
        scoreRealMadrid=scoreRealMadrid+ 1;
        displayFoulForRealMadrid(scoreRealMadrid);
    }
    /**
     * Increase the score by One Red Card.
     */
    public void addOneRedCardForRealMadrid(View v){
        scoreRealMadrid=scoreRealMadrid+ 1;
        displayRedCardForRealMadrid(scoreRealMadrid);
    }
    /**
     * Increase the score by One Yellow Card.
     */
    public void addOneYellowCardForRealMadrid(View v){
        scoreRealMadrid=scoreRealMadrid+ 1;
        displayYellowCardForRealMadrid(scoreRealMadrid);
    }
    /**
     * Increase the score by One Ball Possession.
     */
    public void addOneBallPossessionForRealMadrid(View v){
        scoreRealMadrid=scoreRealMadrid+ 1;
        displayBallPossessionForRealMadrid(scoreRealMadrid);
    }
    /**
     * Displays the given goals for Real Madrid.
     */
    public void displayGoalForRealMadrid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Goal);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Fouls for Real Madrid.
     */
    public void displayFoulForRealMadrid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Red Cards for Real Madrid.
     */
    public void displayRedCardForRealMadrid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Yellow Cards for Real Madrid.
     */
    public void displayYellowCardForRealMadrid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_card);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Ball Possession for Real Madrid.
     */
    public void displayBallPossessionForRealMadrid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ball_possession);
        scoreView.setText(String.valueOf(score));
    }

}



