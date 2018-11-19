package com.example.prabh.calculatorqa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText number1,number2;
    Button Add,Subtract,Multiply,Division;
    Double result_r1;
    Double value1,value2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView result= findViewById(R.id.result);
        number1= (EditText)findViewById(R.id.number1);
        number2=(EditText)findViewById(R.id.number2);
        Add=(Button)findViewById(R.id.Add);
        Subtract=(Button)findViewById(R.id.Subtract);
        Multiply=(Button)findViewById(R.id.Multiply);
        Division=(Button)findViewById(R.id.Division);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Double.parseDouble(number1.getText().toString());
                value2=Double.parseDouble(number2.getText().toString());
                Calculator c= new Calculator();
                result_r1=c.Addition(value1,value2);
                result.setText(String.valueOf(result_r1));
            }
        });
        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Double.parseDouble(number1.getText().toString());
                value2=Double.parseDouble(number2.getText().toString());
                Calculator c= new Calculator();
                result_r1=c.Subtraction(value1,value2);
                result.setText(String.valueOf(result_r1));
            }
        });
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Double.parseDouble(number1.getText().toString());
                value2=Double.parseDouble(number2.getText().toString());
                Calculator c= new Calculator();
                result_r1=c.Multiplication(value1,value2);
                result.setText(String.valueOf(result_r1));
            }
        });
        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Double.parseDouble(number1.getText().toString());
                value2=Double.parseDouble(number2.getText().toString());
                Calculator c= new Calculator();
                result_r1=c.Division(value1,value2);
                result.setText(String.valueOf(result_r1));
            }
        });



    }

}
