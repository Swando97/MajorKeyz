package com.example.adamswanson.majorkeyz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Homepage extends AppCompatActivity {

    int musicBtn = 0;
    MediaPlayer ring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        ring= MediaPlayer.create(Homepage.this,R.raw.pink_panther);
        ring.start();

        ImageButton music = (ImageButton) findViewById(R.id.imageButton2);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (ring.isPlaying() == true)
                // Pause the music player
                ring.pause();
                // If it's not playing
                else
                // Resume the music player
                ring.start();
            }
        });

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        Button btn = (Button) findViewById(R.id.button);
        btn.bringToFront();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Homepage.this, MainActivity.class);
                //myIntent.putExtra("location", changeText.getText().toString());
                startActivity(myIntent);
            }
        });


    }
}
