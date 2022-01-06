package com.example.barcodetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button shoppingrecord, scancode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        shoppingrecord = findViewById(R.id.button);
        scancode = findViewById(R.id.button2);
        shoppingrecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),shoppingrecord.class);
                startActivity(intent);
                finish();
            }
        });

    }
}