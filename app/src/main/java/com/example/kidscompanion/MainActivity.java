package com.example.kidscompanion;

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
        Button alphabetsClick = (Button) findViewById(R.id.alphabetsClick);
        Button numbersClick = (Button) findViewById(R.id.numbersClick);
        Button romanNumeralsClick = (Button) findViewById(R.id.romanNumeralsClick);

        // Setup Alphabet ClickListener
        alphabetsClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alphabetIntent = new Intent(MainActivity.this,AlphabetsActivity.class);
                startActivity(alphabetIntent);
            }
        });

        // Setup Number ClickListener
        numbersClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Setup Roman Numeral ClickListener
        romanNumeralsClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent romanNumeralsIntent = new Intent(MainActivity.this, RomanNumeralsActivity.class);
                startActivity(romanNumeralsIntent);
            }
        });

    }


}


