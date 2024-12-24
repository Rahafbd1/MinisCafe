package com.example.miniscafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class AddItem extends AppCompatActivity {
    TextView Title;
    EditText AddItemF,AddPriceF;
    Button AdButton,Ba;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        Title = (TextView) findViewById(R.id.Title2);
        AddItemF = (EditText) findViewById(R.id.ItemName2);
        AddPriceF = (EditText) findViewById(R.id.ItemPrice2);
        AdButton = (Button) findViewById(R.id.addButton);
        Ba = (Button) findViewById(R.id.B3);

        Ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddItem.this, Admin.class);
                startActivity(intent);
                finish();
            }
        });




    }}

