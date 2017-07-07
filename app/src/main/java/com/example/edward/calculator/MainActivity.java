package com.example.edward.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,
            bplus,bminus,bdivide,bx,b0,bcoma,
            bequal, bclear;
    TextView result;
    double v1, v2;
    boolean add, sub, mult, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bplus = (Button) findViewById(R.id.bplus);
        bminus = (Button) findViewById(R.id.bminus);
        bdivide = (Button) findViewById(R.id.bdivide);
        bx = (Button) findViewById(R.id.bx);
        bcoma = (Button) findViewById(R.id.bcoma);
        bequal = (Button) findViewById(R.id.bequal);
        bclear = (Button) findViewById(R.id.bclear);

        result = (TextView) findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });

        bcoma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });

        bplus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v1=Double.parseDouble(result.getText()+"");
                add = true;
                result.setText(null);
            }
        });

        bminus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v1=Double.parseDouble(result.getText()+"");
                sub = true;
                result.setText(null);
            }
        });

        bx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v1=Double.parseDouble(result.getText()+"");
                mult = true;
                result.setText(null);
            }
        });

        bdivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v1=Double.parseDouble(result.getText()+"");
                div = true;
                result.setText(null);
            }
        });

        bequal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                v2=Double.parseDouble(result.getText()+"");
                if(add==true){
                    result.setText(v1+v2+"");
                    add=false;
                }
                if(sub==true){
                    result.setText(v1-v2+"");
                    sub=false;
                }
                if(mult==true){
                    result.setText(v1*v2+"");
                    mult=false;
                }
                if(div==true){
                    result.setText(v1/v2+"");
                    div=false;
                }
            }
        });

        bclear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });

    }
}
