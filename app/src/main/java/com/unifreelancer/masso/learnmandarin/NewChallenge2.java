package com.unifreelancer.masso.learnmandarin;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class NewChallenge2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_challenge2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        final MediaPlayer speaknihao = MediaPlayer.create(this, R.raw.nihao);



        ImageView btnsound = (ImageView) findViewById(R.id.sound);

        btnsound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        speaknihao.start();
            }
        });



        ImageView btnmicro = (ImageView) findViewById(R.id.microphone);

        btnmicro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Complete.class);
                startActivity(intent);

            }
        });


    }
}
