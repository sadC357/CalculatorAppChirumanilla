package com.example.calculatorappchirumanilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private String buttonText="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView in1_TV=findViewById(R.id.textView_input);
    }


    public void onClick0(View view){
        Button button=findViewById(R.id.button_num0);
        buttonText+=button.getText().toString();
    }

    public void onClick1(View view){
        Button button=findViewById(R.id.button_num1);
        buttonText+=button.getText().toString();
    }

    public void onClick2(View view3){
        button=findViewById(R.id.button_num2);
        buttonText+=button.getText().toString();
        Log.i("ch_sad",buttonText);
    }

    public void onClick3(View view){
        Button button=findViewById(R.id.button_num3);
        buttonText+=button.getText().toString();
    }

    public void onClick4(View view){
        Button button=findViewById(R.id.button_num4);
        buttonText+=button.getText().toString();
    }

    public void onClickPlus(View view){
        Button button=findViewById(R.id.button_plus);
        buttonText+=button.getText().toString();
    }

    public void onClickEquals(View view){
        Button button=findViewById(R.id.button_equals);
        buttonText+=button.getText().toString();
        Log.i("ch_sad",buttonText);
    }

}