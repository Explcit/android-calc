package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        EditText num1 = (EditText) findViewById(R.id.in1);
        EditText num2 = (EditText) findViewById(R.id.in1);

        TextView resTxt = (TextView) findViewById(R.id.resTxt);

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int resultSum = n1 + n2;
        System.out.println(resultSum);
    }
}