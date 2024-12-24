package com.example.miniscafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity {

   Button VieMe,LogOut,admin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        VieMe=(Button) findViewById(R.id.Menu2);
        LogOut=(Button) findViewById(R.id.LogOut3);
        admin=(Button)findViewById(R.id.Admin1);


        VieMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, Menu.class);
                startActivity(intent);
            }
        });


        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this, Admin.class);
                startActivity(intent);
                finish();
            }
        });

        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Homepage.this,Login.class);
                startActivity(intent);
                finish();

            }
        });





    }
}