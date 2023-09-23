package com.example.agricare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;

public class SpWithAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp_with_animation);

        Handler handler = new Handler();

        Runnable delayedIntentRunnable = new Runnable() {
            @Override
            public void run() {
                // Create and start your intent here
                Intent intent = new Intent(SpWithAnimationActivity.this, tip_3.class);
                startActivity(intent);
            }
        };
        handler.postDelayed(delayedIntentRunnable, 4000);
    }

}