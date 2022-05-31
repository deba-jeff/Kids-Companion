package com.example.kidscompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        final String[] numbers = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
                "16","17","18","19","20"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers);
        GridView numbersList = (GridView) findViewById(R.id.list_item);
        numbersList.setAdapter(adapter);
        numbersList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Get the Number associated with the specified position in the list.
                String numbers = (parent.getItemAtPosition(position)).toString();

                // Display the Number as a Toast message
                Toast.makeText(NumbersActivity.this, numbers, Toast.LENGTH_LONG).show();
            }
        });

    }


}