package com.unifreelancer.masso.learnmandarin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NewChallenge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_challenge);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        ImageView btngreet = (ImageView) findViewById(R.id.greetings);
        // Button "Kebelankang" Event Handling
        btngreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), NewChallenge1.class);
                startActivity(intent);

            }
        });
    }
}
