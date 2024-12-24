package com.example.miniscafe1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
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

public class Registration extends AppCompatActivity {
    EditText FName,LName,eml,ps,CoPa;
    Button regg;
    TextView Register,SingUp;
    ProgressBar pb;
    FirebaseAuth fbu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        fbu=FirebaseAuth.getInstance();

        FName=(EditText) findViewById(R.id.firstName);
        LName=(EditText) findViewById(R.id.lastName);
        eml=(EditText) findViewById(R.id.email);
        ps=(EditText) findViewById(R.id.password);
        CoPa=(EditText) findViewById(R.id.confirmPassword);
        Register=(TextView) findViewById(R.id.registrationTitle);
        SingUp=(TextView) findViewById(R.id.loginLink);
        regg=(Button) findViewById(R.id.button);
        pb=(ProgressBar) findViewById(R.id.progressBar);


        regg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                registerNewUser();
            }
        });

        SingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this, Login.class);
                startActivity(intent);
                finish();
            }
        });

    }


    public void registerNewUser(){
        pb.setVisibility(View.VISIBLE);
        String em=eml.getText().toString();
        String Fm=FName.getText().toString();
        String Ln=LName.getText().toString();
        String P=ps.getText().toString();
        String p=CoPa.getText().toString();
        String rg=Register.getText().toString();
        String Sin=SingUp.getText().toString();

        

        if(TextUtils.isEmpty(em)){
            Toast.makeText(getApplicationContext(),"Please Enter Email",Toast.LENGTH_LONG).show();;
            return;
        }

        if(TextUtils.isEmpty(P)){
            Toast.makeText(getApplicationContext(),"Please Enter Password",Toast.LENGTH_LONG).show();;
            return;
        }

        fbu.createUserWithEmailAndPassword(em,p).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Registration is Successful",Toast.LENGTH_LONG).show();
                    pb.setVisibility(View.VISIBLE);
                    Intent mm=new Intent(Registration.this,Login.class);
                    startActivity(mm);
                }

                else
                {
                    Toast.makeText(getApplicationContext(),"Registration Failed,Please Register Again",Toast.LENGTH_LONG).show();;
                    pb.setVisibility(View.GONE);
                }


            }
        });
    }}