package com.example.miniscafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class DeleteItem extends AppCompatActivity {

    TextView Title;
    EditText addItem1, addPrice1;
    Button Delete, BackHome1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_item);

        Title =(TextView) findViewById(R.id.Title1);
        addItem1= (EditText) findViewById(R.id.ItemName1);
        addPrice1 =(EditText) findViewById(R.id.ItemPrice1);
        Delete =(Button) findViewById(R.id.DeleteButton);
        BackHome1 =(Button) findViewById(R.id.b2);


       BackHome1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(DeleteItem.this, Admin.class);
               startActivity(intent);
               finish();
           }
       });



    }
}








