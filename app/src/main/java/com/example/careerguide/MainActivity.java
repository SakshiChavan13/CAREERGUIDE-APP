package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread t = new Thread(){
            @Override
            public void run(){
                try{
                    sleep(2000);
                }catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);

                }
            }
        };

        t.start();

    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}