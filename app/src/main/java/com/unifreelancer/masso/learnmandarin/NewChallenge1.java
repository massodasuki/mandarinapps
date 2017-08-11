package com.unifreelancer.masso.learnmandarin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NewChallenge1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_challenge1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ImageView btnhello = (ImageView) findViewById(R.id.hello);
        // Button "Kebelankang" Event Handling
        btnhello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), NewChallenge2.class);
                startActivity(intent);

            }
        });
    }
}
