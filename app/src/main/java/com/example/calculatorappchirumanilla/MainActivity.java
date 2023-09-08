package com.example.calculatorappchirumanilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private int input_one;
    private int input_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public double addition(){
        return (double) input_one+input_two;
    }

    public double subtraction(){
        return (double) input_one-input_two;
    }

    public double division(){
        return (double) input_one/input_two;
    }

}