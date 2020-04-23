package com.myapplicationdev.android.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_page);
        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");
        TextView tv = findViewById(R.id.textView6);
        tv.setText("Read up on materials before class: " + info[1]+
                "Arrive on time so as not to miss important parts of the lesson: " + info[2] +
                "Attempt the problem yourself:" + info[3] +
                "Reflection: " + info[0]

        );
    }
}
