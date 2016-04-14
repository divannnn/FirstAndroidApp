package com.example.P0081viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.myText);
        myTextView.setText("Я ебу гусей!");
        Button myBtn = (Button) findViewById(R.id.myBtn);
        myBtn.setText("Я выебу гуся");
        myBtn.setEnabled(false);
    }
}
