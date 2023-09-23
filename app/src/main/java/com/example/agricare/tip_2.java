package com.example.agricare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tip_2 extends AppCompatActivity {

    Button btn2,sk1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip2);

        btn2 = findViewById(R.id.next);
        sk1 = findViewById(R.id.skip2);
        sk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tip_2.this,dashboard.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tip_2.this,dashboard.class);
                startActivity(intent);
            }
        });
    }
}