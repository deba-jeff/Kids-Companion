package com.example.kidscompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class AlphabetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        final String[] alphabets = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V",
                "W","X","Y","Z"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alphabets);
        GridView alphabetsList = (GridView) findViewById(R.id.list_item);
        alphabetsList.setAdapter(adapter);
        alphabetsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Get the Alphabet associated with the specified position in the list.
                String alphabet = (parent.getItemAtPosition(position)).toString();

                // Display the Alphabet as a Toast message
                Toast.makeText(AlphabetsActivity.this, alphabet, Toast.LENGTH_LONG).show();
            }
        });

    }


}