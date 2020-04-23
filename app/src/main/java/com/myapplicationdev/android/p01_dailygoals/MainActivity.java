package com.myapplicationdev.android.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDone = findViewById(R.id.button);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg1 =  findViewById(R.id.RG1);
                int selectedBtnid1 = rg1.getCheckedRadioButtonId();
                RadioButton rb1 = findViewById(selectedBtnid1);
                String RB1 = rb1.getText().toString();

                RadioGroup rg2 =  findViewById(R.id.RG2);
                int selectedBtnid2 = rg1.getCheckedRadioButtonId();
                RadioButton rb2 = findViewById(selectedBtnid2);
                String RB2 = rb2.getText().toString();

                RadioGroup rg3 =  findViewById(R.id.RG3);
                int selectedBtnid3 = rg1.getCheckedRadioButtonId();
                RadioButton rb3 = findViewById(selectedBtnid3);
                String RB3 = rb3.getText().toString();

                EditText et = findViewById(R.id.editText);
               String[] info ={et.getText().toString(),RB1,RB2,RB3};
                Intent i = new Intent(MainActivity.this,AnswerPage.class);
                i.putExtra("info",info);
                startActivity(i);
            }
        });
    }
}
