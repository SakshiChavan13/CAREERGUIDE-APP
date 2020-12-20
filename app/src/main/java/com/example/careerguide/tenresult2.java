package com.example.careerguide;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class tenresult2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenresult2);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(tenresult2.this, MainActivity3.class);
        startActivity(intent);
    }
}