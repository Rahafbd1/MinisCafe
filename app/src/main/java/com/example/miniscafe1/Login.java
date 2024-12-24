package com.example.miniscafe1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    EditText email,password;
    TextView Ti,reg;
    Button login;
    ProgressBar pb;
    FirebaseAuth ff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        ff=FirebaseAuth.getInstance();
        email=(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.password);
        login=(Button) findViewById(R.id.loginButton);
        Ti=(TextView) findViewById(R.id.loginTitle);
        reg=(TextView) findViewById(R.id.registerLink);
        pb=(ProgressBar) findViewById(R.id.progressBar1);




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUserAccount();

            }
        });


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Registration.class);
                startActivity(intent);
                finish();
            }
        });

    }


    public void loginUserAccount() {

        pb.setVisibility(View.VISIBLE);
        String emil = email.getText().toString();
        String pas = password.getText().toString();

        if (TextUtils.isEmpty(emil)) {
            Toast.makeText(getApplicationContext(), "Please Enter Email", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(pas)) {
            Toast.makeText(getApplicationContext(), "Please Enter Password", Toast.LENGTH_LONG).show();
            return;
        }

        ff.signInWithEmailAndPassword(emil, pas).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Login is Successful", Toast.LENGTH_LONG).show();
                    pb.setVisibility(View.VISIBLE);
                    Intent mp = new Intent(Login.this, Homepage.class);
                    startActivity(mp);
                } else {
                    Toast.makeText(getApplicationContext(), "Login Failed,Please Login Again", Toast.LENGTH_LONG).show();
                    pb.setVisibility(View.GONE);
                }

            }

        });


    }}