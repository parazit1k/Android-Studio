package com.example.general_v10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.ThreadLocalRandom;

public class Activity13 extends AppCompatActivity {

    static int min = 1;
    static int max = 10;

    static int digit = ThreadLocalRandom.current().nextInt(min, max + 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);

        Button tr = findViewById(R.id.trytoguess);
        Button back = findViewById(R.id.back13);
        Button easy = findViewById(R.id.easy);
        Button medium = findViewById(R.id.medium);
        Button hard = findViewById(R.id.hard);
        EditText ch = findViewById(R.id.randominput);

        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(digit);
                try{
                    if(digit == Integer.parseInt(String.valueOf(ch.getText()))){
                        ch.setText("");
                        ch.setHint("Отгадал!");
                    }else{
                        ch.setText("");
                        ch.setHint("Увы!");
                    }
                }catch (Exception ignored){
                    ch.setText("");
                    ch.setHint("НУЖНО ПИСАТЬ ЧИСЛА!");
                }
            }
        });

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                max = 5;
                digit = ThreadLocalRandom.current().nextInt(min, max + 1);
                Toast.makeText(Activity13.this, "Числа от 1-5", Toast.LENGTH_SHORT).
                        show();
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                max = 20;
                digit = ThreadLocalRandom.current().nextInt(min, max + 1);
                Toast.makeText(Activity13.this, "Числа от 1-20", Toast.LENGTH_SHORT).
                        show();
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                max = 100;
                digit = ThreadLocalRandom.current().nextInt(min, max + 1);
                Toast.makeText(Activity13.this, "Числа от 1-100", Toast.LENGTH_SHORT).
                        show();
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