package com.example.kidscompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class RomanNumeralsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        final String[] romanNumerals = {"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV",
                "XVI","XVII","XVIII","XIX","XX"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, romanNumerals);
        GridView romanNumeralsList = (GridView) findViewById(R.id.list_item);
        romanNumeralsList.setAdapter(adapter);
        romanNumeralsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Get the Roman Numeral associated with the specified position in the list.
                String romanNumerals = (parent.getItemAtPosition(position)).toString();

                // Display the Roman Numeral as a Toast message
                Toast.makeText(RomanNumeralsActivity.this, romanNumerals, Toast.LENGTH_LONG).show();
            }
        });

    }


}