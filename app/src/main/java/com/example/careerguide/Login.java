package com.example.careerguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {

    private EditText email;
    private EditText password;

    private FirebaseAuth mauth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.maillogin);
        password = findViewById(R.id.passlogin);
        Button login = findViewById(R.id.Loginbutton);

        mauth = FirebaseAuth.getInstance();
        FirebaseUser user = mauth.getCurrentUser();
        if(user != null){
            finish();
            Toast.makeText( Login.this , "Already logged in." , Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Login.this , MainActivity3.class));
        }

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt_email = email.getText().toString();
                String txt_password = password.getText().toString();

                loginUser(txt_email , txt_password);
            }
        });
    }

    private void loginUser(String email, String password){

       mauth.signInWithEmailAndPassword( email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
           @Override
           public void onComplete(@NonNull Task<AuthResult> task) {
               if(task.isSuccessful()){

                   Toast.makeText( Login.this , "login succesful" , Toast.LENGTH_SHORT).show();
                   startActivity(new Intent(Login.this , MainActivity3.class));
               }else{
                   Toast.makeText( Login.this , "login failed !!, try again." , Toast.LENGTH_SHORT).show();

               }
           }
       });


    }

}
