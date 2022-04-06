package com.example.general_v10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button md11 = findViewById(R.id.md11);
        Button md12 = findViewById(R.id.md12);
        Button md13 = findViewById(R.id.md13);
        Button md14 = findViewById(R.id.md14);
        Button md15 = findViewById(R.id.md15);
        Button md16 = findViewById(R.id.md16);
        Button md21 = findViewById(R.id.md21);
        Button md22 = findViewById(R.id.md22);
        Button md23 = findViewById(R.id.md23);

        md11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a11();
            }
        });

        md12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a12();
            }
        });

        md13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a13();
            }
        });

        md14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a14();
            }
        });

        md16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a16();
            }
        });
        md21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a21();
            }
        });

        md23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a23();
            }
        });

    }

    public void a11(){
        Intent intent = new Intent(this, Activity11.class);
        startActivity(intent);
    }

    public void a12(){
        Intent intent = new Intent(this, Activity12.class);
        startActivity(intent);
    }

    public void a13(){
        Intent intent = new Intent(this, Activity13.class);
        startActivity(intent);
    }
    public void a14(){
        Intent intent = new Intent(this, Activity14.class);
        startActivity(intent);
    }

    public void a16(){
        Intent intent = new Intent(this, Activity16.class);
        startActivity(intent);
    }
    public void a21(){
        Intent intent = new Intent(this, Activity21.class);
        startActivity(intent);
    }

    public void a23(){
        Intent intent = new Intent(this, Activity23.class);
        startActivity(intent);
    }

}