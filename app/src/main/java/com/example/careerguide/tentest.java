package com.example.careerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class tentest extends AppCompatActivity {
    private int  science=0, commerce = 0, arts =0;
    private RadioGroup rgroup1;
    private RadioGroup rgroup2;
    private RadioGroup rgroup3;
    private RadioGroup rgroup4;
    private RadioGroup rgroup5;
    private RadioGroup rgroup6;
    private RadioGroup rgroup7;
    private RadioGroup rgroup8;
    private RadioGroup rgroup9;
    private Button bsubmit;

    private RadioButton ans1;
    private RadioButton ans2;
    private RadioButton ans3;
    private RadioButton ans4;
    private RadioButton ans5;
    private RadioButton ans6;
    private RadioButton ans7;
    private RadioButton ans8;
    private RadioButton ans9;
     //private CheckBox confirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentest);
        rgroup1 =findViewById(R.id.group1);
        rgroup2 =findViewById(R.id.group2);
        rgroup3 =findViewById(R.id.group3);
        rgroup4 =findViewById(R.id.group4);
        rgroup5 =findViewById(R.id.group5);
        rgroup6 =findViewById(R.id.group6);
        rgroup7 =findViewById(R.id.group7);
        rgroup8 =findViewById(R.id.group8);
        rgroup9 =findViewById(R.id.group9);

        bsubmit = findViewById(R.id.submit);


        bsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans1 = rgroup1.findViewById(rgroup1.getCheckedRadioButtonId());
                ans2 = rgroup2.findViewById(rgroup2.getCheckedRadioButtonId());
                ans3 = rgroup3.findViewById(rgroup3.getCheckedRadioButtonId());
                ans4 = rgroup4.findViewById(rgroup4.getCheckedRadioButtonId());
                ans5 = rgroup5.findViewById(rgroup5.getCheckedRadioButtonId());
                ans6 = rgroup6.findViewById(rgroup6.getCheckedRadioButtonId());
                ans7 = rgroup7.findViewById(rgroup7.getCheckedRadioButtonId());
                ans8 = rgroup8.findViewById(rgroup8.getCheckedRadioButtonId());
                ans9 = rgroup9.findViewById(rgroup9.getCheckedRadioButtonId());


                if (ans1.getText().equals("YES")) {
                    commerce = commerce + 1;
                }
                if (ans2.getText().equals("YES")) {
                    commerce = commerce + 1;
                }
                if (ans3.getText().equals("YES")) {
                    science = science + 1;
                }
                if (ans4.getText().equals("YES")){
                    science = science + 1;
                }
                if (ans5.getText().equals("YES")) {
                    commerce = commerce + 1;
                }
                if (ans6.getText().equals("YES")) {
                    arts = arts + 1;

                }
                if (ans7.getText().equals("YES")){
                    science = science + 1;
                }
                if(ans8.getText().equals("YES")) {
                    arts = arts + 1;
                }
                if (ans9.getText().equals("YES")) {
                    arts = arts + 1;
                }




                if(science == 3 && commerce ==3 && arts ==3) {
                    Intent intent = new Intent(tentest.this, tenresult1.class);
                    startActivity(intent);
                } else if(science == 2 && commerce ==2 && arts ==2) {
                    Intent intent = new Intent(tentest.this, tenresult1.class);
                    startActivity(intent);
                } else  if(science == 1 && commerce ==1 && arts ==1) {
                    Intent intent = new Intent(tentest.this, tenresult1.class);
                    startActivity(intent);
                }else if ((science > commerce) && (science > arts)) {

                      Intent intent = new Intent(tentest.this, tenresult2.class);
                      startActivity(intent);
                }
              else  if((commerce > science )&& (commerce > arts) ) {

                    Intent intent = new Intent(tentest.this, tenresult3.class);
                    startActivity(intent);

              }
                else if((arts > science )&& (arts > commerce))
                {

                    Intent intent = new Intent(tentest.this,tenresult4.class);
                    startActivity(intent);

                }else if ((science == commerce) && (science != arts)) {

                    Intent intent = new Intent(tentest.this, tenresult2.class);
                    startActivity(intent);
                }else if ((science == arts) && (science != commerce)) {

                    Intent intent = new Intent(tentest.this, tenresult2.class);
                    startActivity(intent);
                }else  {

                    Intent intent = new Intent(tentest.this, tenresult3.class);
                    startActivity(intent);
                }



            }

    });








    }


}
