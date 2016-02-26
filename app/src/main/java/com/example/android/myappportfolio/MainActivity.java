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

    public void spotifyButton (View v){
        Toast.makeText(this, R.string.toastPT1+R.string.spotifyStreamer+R.string.toastEnd, Toast.LENGTH_SHORT).show();
    }public void scoresButton (View v){
        Toast.makeText(this, R.string.toastPT1+R.string.scoresApp+R.string.toastEnd, Toast.LENGTH_SHORT).show();
    }public void libraryButton (View v){
        Toast.makeText(this, R.string.toastPT1+R.string.libraryApp+R.string.toastEnd, Toast.LENGTH_SHORT).show();
    }public void buildButton (View v){
        Toast.makeText(this, R.string.toastPT1+R.string.buildItBiggerApp+R.string.toastEnd, Toast.LENGTH_SHORT).show();
    }public void xyzButton (View v){
        Toast.makeText(this, R.string.toastPT1+R.string.xyzReaderApp+R.string.toastEnd, Toast.LENGTH_SHORT).show();
    }public void capstoneButton (View v){
        Toast.makeText(this, R.string.toastPT1+R.string.capstoneLabel+R.string.toastEnd, Toast.LENGTH_SHORT).show();
    }
}
