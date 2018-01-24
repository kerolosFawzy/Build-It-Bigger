package com.massive.displaythejoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowTheJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_joke_activity);
        Intent intent = getIntent();
        String joke = intent.getStringExtra("Joke");
        TextView JokeView;
        try {
            JokeView = (TextView) findViewById(R.id.JokeView);
            if (!joke.isEmpty())
                JokeView.setText(joke);
        } catch (NoSuchFieldError error) {
        }

    }

}
