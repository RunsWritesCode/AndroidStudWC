package com.example.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultViewActivity extends AppCompatActivity {

    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_view);

        Log.d(getClass().toString(), "onCreate called");

        answer = findViewById(R.id.textResultView);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answerx = extras.getString("wordCount");
        answer.setText(answerx);

    }
}
