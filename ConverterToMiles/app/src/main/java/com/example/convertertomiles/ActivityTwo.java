package com.example.convertertomiles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {
    TextView textView;
    double calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        textView=findViewById(R.id.textView);
        calculate=getIntent().getExtras().getDouble("value");
        textView.setText(""+calculate + " miles");


    }
}
