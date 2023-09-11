package com.example.calculatorappchirumanilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView input;
    private String in_string="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setInputs(String val){
        in_string=in_string+val;
        input.setText(in_string+val);
    }

    public void onClick(View view){
        String buttonText=((Button)view).getText().toString();
        setInputs(buttonText);
    }


}