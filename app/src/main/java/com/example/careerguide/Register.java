package com.example.careerguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
    
    private EditText regname;
    private EditText  regemail;
    private EditText regpass;
    private Button register;
    private FirebaseAuth mAuth;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_register);
        
        regname = findViewById(R.id.registername);
        regemail = findViewById(R.id.registermail);
        regpass = findViewById(R.id.registerpassword);
        register = findViewById(R.id.regisbutton2);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  txt_regname = regname.getText().toString();
                String  txt_regemail = regemail.getText().toString();
                String  txt_regpass = regpass.getText().toString();
                
                if( TextUtils.isEmpty(txt_regemail)|| TextUtils.isEmpty(txt_regpass)||  TextUtils.isEmpty(txt_regname)){
                    Toast.makeText(Register.this, "Invalid, please enter correct value",Toast.LENGTH_SHORT).show();
                }else if(txt_regpass.length() < 6){
                    Toast.makeText(Register.this ,"Password must be greater than 6 characters",Toast.LENGTH_SHORT).show();
                    
                }else
                {
                    registerUser(txt_regemail,txt_regpass);
                }
            }
        });
        

}

    private void registerUser(String txt_regemail, String txt_regpass) {

            mAuth.createUserWithEmailAndPassword(txt_regemail,txt_regpass).addOnCompleteListener(Register.this,new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(Register.this, "Succesfully registered.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Register.this,Login.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(Register.this, "Registration failed", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }
    }
