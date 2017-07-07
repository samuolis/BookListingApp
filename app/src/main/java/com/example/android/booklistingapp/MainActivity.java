package com.example.android.booklistingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static EditText bookName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView search = (TextView) findViewById(R.id.mainText);
        bookName= (EditText) findViewById(R.id.mainEdit);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bookName.getText().toString().length()<3){
                    Toast.makeText(MainActivity.this,"Please enter a name with at least 3 letters !!", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent homeIntent = new Intent(MainActivity.this, book_list.class);
                    startActivity(homeIntent);
                }
            }

        });



    }
}
