package com.example.codeclan.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    TextView inputText;
    TextView answer;
    Button count;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        inputText = findViewById(R.id.input_text);
        count = findViewById(R.id.button);
        answer = findViewById(R.id.answer);

    }

    public void onCountButtonClicked(View button) {
        Log.d(getClass().toString(), "onCountButtonClicked was called");
        WordCount wordcount = new WordCount();
        String textInput = inputText.getText().toString();
       Integer count = wordcount.countWords(textInput);
       answer.setText(count.toString());

    }



}
