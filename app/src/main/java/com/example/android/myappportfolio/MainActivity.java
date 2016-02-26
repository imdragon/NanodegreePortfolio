package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    Below are the methods for showing a toast for each button
     */
    public void spotifyButton(View v) {
        Toast.makeText(this, "This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT).show();
    }

    public void scoresButton(View v) {
        Toast.makeText(this, "This button will launch my Scores app!", Toast.LENGTH_SHORT).show();
    }

    public void libraryButton(View v) {

        Toast.makeText(this, "This button will launch my Library app", Toast.LENGTH_SHORT).show();
    }

    public void buildButton(View v) {
        Toast.makeText(this, "This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT).show();
    }

    public void xyzButton(View v) {
        Toast.makeText(this, "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();
    }

    public void capstoneButton(View v) {
        Toast.makeText(this, "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
    }
}
