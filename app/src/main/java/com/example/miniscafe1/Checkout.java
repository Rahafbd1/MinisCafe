package com.example.miniscafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Checkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        String productName = getIntent().getStringExtra("productName");
        String productPrice = getIntent().getStringExtra("productPrice");


        TextView productNameTextView = findViewById(R.id.productNameTextView);
        TextView productPriceTextView = findViewById(R.id.productPriceTextView);
        Button confirmOrderButton = findViewById(R.id.confirmOrderButton);
        Button backMenuButton= findViewById(R.id.backMenu);

        productNameTextView.setText(productName);
        productPriceTextView.setText("Price: " + productPrice);

        backMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Checkout.this,Menu.class);
                startActivity(intent);
                finish();
            }
        });


        confirmOrderButton.setOnClickListener(v -> {
            Toast.makeText(Checkout.this, "Order Confirmed: " + productName, Toast.LENGTH_SHORT).show();
        });
    }
}