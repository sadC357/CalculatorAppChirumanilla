package com.example.calculatorappchirumanilla;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView in;
    private String cur="";
    private double val_1=0;
    private String func="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in=findViewById(R.id.textView_output);
        reset();
    }

    public void getNum(View input) {
        String num;
        Button button=(Button)input;
        num=button.getText().toString();
        cur+=num;
        reset();
    }

    public void getFunction(View input) {
        Button button=(Button)input;
        func=button.getText().toString();

        /*https://www.geeksforgeeks.org/convert-string-to-double-in-java/
        parseDouble() converts the String value into a double value
        */
        val_1=Double.parseDouble(cur);
        cur="";
    }

    public void clear(View input) {
        cur="";
        func="";
        reset();
    }

    public void equalsTo(View input) {
        if (cur.length()!=0 && !func.equals("%")) {
                /*https://www.geeksforgeeks.org/convert-string-to-double-in-java/
                parseDouble() converts the String value into a double value
                 */
                double val_2=Double.parseDouble(cur);
                double out_1=0.0;
                if (func.equals("+")) {
                    out_1=val_1+val_2;
                } else if (func.equals("-")) {
                    out_1=val_1-val_2;
                } else if (func.equals("*")) {
                    out_1=val_1*val_2;
                } else if (func.equals("/")) {
                    if (val_2!=0) {
                        out_1=val_1/val_2;
                    } else {
                        cur="Error: Can't divide a number by zero";
                        reset();
                        return;
                    }
                } else if (func.equals("^")) {
                    /*https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/pow
                    Math.pow() returns the first value to the power of the second value
                     */
                    out_1=Math.pow(val_1,val_2);
                }

                /*https://www.tutorialspoint.com/java/number_valueof.htm
                valueOf() makes the double value into a String
                 */
                cur=String.valueOf(out_1);
                func="";
                reset();
        }
        if(func.equals("%")) {
            double out_2=0.0;
            out_2=val_1/100;
            /*https://www.tutorialspoint.com/java/number_valueof.htm
            valueOf() returns the double value as a String
             */
            cur=String.valueOf(out_2);
            func="";
            reset();
        }
    }

    private void reset() {
        if(cur.length()==0){
            in.setText("0");
        }else{
            in.setText(cur);
        }
    }
}