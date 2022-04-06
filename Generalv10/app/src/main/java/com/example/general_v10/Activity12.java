package com.example.general_v10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity12 extends AppCompatActivity {

    private long c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);

        Button click = findViewById(R.id.click);
        Button minus = findViewById(R.id.minus);
        Button back = findViewById(R.id.back12);
        TextView counter = findViewById(R.id.clicker);


        click.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                c++;
                counter.setText("Кликов:"+c);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                c--;
                counter.setText("Кликов:"+c);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}