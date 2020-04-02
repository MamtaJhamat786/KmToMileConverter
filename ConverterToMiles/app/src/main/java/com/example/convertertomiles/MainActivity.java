package com.example.convertertomiles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    DecimalFormat decimalFormat=new DecimalFormat("0.00");
     EditText editText;
      double number, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public  void openActivity2(){
        editText=findViewById(R.id.editText);
        number=Double.parseDouble(editText.getText().toString());
        result=number*0.621317;
        double formatted=Double.parseDouble(decimalFormat.format(result));
        Intent intent=new Intent(this,ActivityTwo.class);
        intent.putExtra("value",formatted);
        startActivity(intent);
    }
}
