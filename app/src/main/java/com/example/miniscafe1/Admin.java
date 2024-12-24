package com.example.miniscafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Admin extends AppCompatActivity {

    Button addItemButton, deleteItemButton, updateItemButton, HomeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        addItemButton=(Button) findViewById(R.id.AddItem1);
        deleteItemButton =(Button) findViewById(R.id.DeleteItem1);
        updateItemButton =(Button) findViewById(R.id.UpdateItem1);
        HomeButton =(Button) findViewById(R.id.homeButton);

      HomeButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(Admin.this,Homepage.class);
              startActivity(intent);
              finish();
          }
      });

        addItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Admin.this, AddItem.class);
                startActivity(intent);
            }
        });

        deleteItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Admin.this, DeleteItem.class);
                startActivity(intent);
            }
        });
        updateItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Admin.this, UpdateItem.class);
                startActivity(intent);
            }
        });




    }




}