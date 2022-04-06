package com.example.general_v10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_14);

        Button ok = findViewById(R.id.ok14);
        Button cancel = findViewById(R.id.cancel14);
        Button update = findViewById(R.id.update);
        TextView text = findViewById(R.id.status);
        EditText et = findViewById(R.id.input14);
        Button back = findViewById(R.id.back14);


        ok.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                text.setText("OK нажат!");
                Toast.makeText(Activity14.this, et.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                text.setText("CANCEL нажат!");
                Toast.makeText(Activity14.this, et.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                text.setText("UPDATE нажат!");
                et.setText("");
                Toast.makeText(Activity14.this, et.getText().toString(),
                        Toast.LENGTH_SHORT).show();
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