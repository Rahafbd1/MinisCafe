package com.example.miniscafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UpdateItem extends AppCompatActivity {
    TextView Title3;
    EditText ItemName3, ItemPrice3;
    Button UpButton, B4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_item);

        Title3 = findViewById(R.id.Title3);
        ItemName3 = findViewById(R.id.ItemName3);
        ItemPrice3 = findViewById(R.id.ItemPrice3);
        UpButton = findViewById(R.id.UpButton);
        B4 = findViewById(R.id.B4);


        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(UpdateItem.this,Admin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}