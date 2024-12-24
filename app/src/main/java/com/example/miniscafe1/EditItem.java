package com.example.miniscafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditItem extends AppCompatActivity {

    TextView Title;
    EditText ItemName, ItemPrice;
    Button SaveButton, B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        Title = findViewById(R.id.Title);
        ItemName = findViewById(R.id.ItemName);
        ItemPrice = findViewById(R.id.ItemPrice);
        SaveButton = findViewById(R.id.SaveButton);
        B1 = findViewById(R.id.B1);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EditItem.this, Admin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}