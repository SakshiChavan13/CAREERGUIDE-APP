package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class tenresult4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenresult4);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(tenresult4.this, MainActivity3.class);
        startActivity(intent);
    }
}