package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class after12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after12);
        Button scibio = findViewById(R.id.scibio);
        Button scima = findViewById(R.id.scimath);

        Button comm = findViewById(R.id.com);
        Button arts = findViewById(R.id.art);
        scibio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after12.this,sciwithbio.class);
                startActivity(intent);

            }
        });
        scima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after12.this, sciwithmath.class);
                startActivity(intent);

            }
        });

        comm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after12.this,commerce12.class);
                startActivity(intent);

            }
        });
        arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after12.this,arts12.class);
                startActivity(intent);

            }
        });
    }
}