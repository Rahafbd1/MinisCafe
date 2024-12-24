package com.example.miniscafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(v -> {

            Intent intent = new Intent(Menu.this,Homepage.class);
            startActivity(intent);
            finish();
        });


        Button orderHotLatteButton = findViewById(R.id.SpanHot);
        orderHotLatteButton.setOnClickListener(v -> {
            Intent intent = new Intent(Menu.this, Checkout.class);
            intent.putExtra("productName", "Hot Latte");
            intent.putExtra("productPrice", "2.00 OMR");
            startActivity(intent);
        });

        Button orderColdLatteButton = findViewById(R.id.ColdSpan);
        orderColdLatteButton.setOnClickListener(v -> {
            Intent intent = new Intent(Menu.this, Checkout.class);
            intent.putExtra("productName", "Spanish Latte");
            intent.putExtra("productPrice", "2.00 OMR");
            startActivity(intent);
        });


        Button orderRedVelvetButton = findViewById(R.id.RedCake);
        orderRedVelvetButton.setOnClickListener(v -> {
            Intent intent = new Intent(Menu.this, Checkout.class);
            intent.putExtra("productName", "Red Velvet Cake");
            intent.putExtra("productPrice", "3.50 OMR");
            startActivity(intent);
        });

        Button orderBrowniesButton = findViewById(R.id.Bron);
        orderBrowniesButton.setOnClickListener(v -> {
            Intent intent = new Intent(Menu.this, Checkout.class);
            intent.putExtra("productName", "Red Velvet Cake");
            intent.putExtra("productPrice", "2.50 OMR");
            startActivity(intent);
        });



    }
}