package com.unifreelancer.masso.learnmandarin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Complete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ImageView btnmicro = (ImageView) findViewById(R.id.go_continue);

        btnmicro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Leaderboard.class);
                startActivity(intent);

            }
        });
    }
}
