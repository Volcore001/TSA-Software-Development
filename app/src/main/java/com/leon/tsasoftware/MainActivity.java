package com.leon.tsasoftware;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button SearchAuthors, ButtonYourAuthors, ButtonUpcomingBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        SearchAuthors = findViewById(R.id.ButtonSearch);
        ButtonYourAuthors = findViewById(R.id.buttonYourAuthors);
        ButtonUpcomingBooks = findViewById(R.id.button_upcoming_books);


        SearchAuthors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent newIntent = new Intent(MainActivity.this,Search.class);
                startActivity(newIntent);
            }
        });


    }

}
