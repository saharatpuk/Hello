package com.example.saharat.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.button_1);
        btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button_2);
        btn2.setOnClickListener(this);

        Button btn3 = (Button) findViewById(R.id.button_3);
        btn3.setOnClickListener(this);

        Button btn4 = (Button) findViewById(R.id.button_4);
        btn4.setOnClickListener(this);

        Button btn5 = (Button) findViewById(R.id.button_5);
        btn5.setOnClickListener(this);

        Button btn6 = (Button) findViewById(R.id.button_6);
        btn6.setOnClickListener(this);

        Button btn7 = (Button) findViewById(R.id.button_7);
        btn7.setOnClickListener(this);

        Button btn8 = (Button) findViewById(R.id.button_8);
        btn8.setOnClickListener(this);

        Button btn9 = (Button) findViewById(R.id.button_9);
        btn9.setOnClickListener(this);

        Button btn0 = (Button) findViewById(R.id.button_0);
        btn0.setOnClickListener(this);

        Button btnClear = (Button) findViewById(R.id.clear_button);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        TextView tv = (TextView) findViewById(R.id.digit_text_view);
        int id = view.getId();
        Button btn = (Button) view;


        if (id == R.id.button_1) {
            if (tv.length() <= 6)
                tv.setText(tv.getText() + "1");
        }
        if (id == R.id.button_2) {
            if (tv.length() <= 6)
                tv.setText(tv.getText() + "2");
        }
        if (id == R.id.button_3) {
            if (tv.length() <= 6)
                tv.setText(tv.getText() + "3");
        }
        if (id == R.id.button_4) {
            if (tv.length() <= 6)
                tv.setText(tv.getText() + "4");
        }
        if (id == R.id.button_5) {
            if (tv.length() <= 6)
                tv.setText(tv.getText() + "5");
        }
        if (id == R.id.button_6) {
            if (tv.length() <= 6)
                tv.setText(tv.getText() + "6");
        }
        if (id == R.id.button_7) {
            if (tv.length() <= 6)
                tv.setText(tv.getText() + "7");
        }
        if (id == R.id.button_8) {
            if (tv.length() <= 6)
                tv.setText(tv.getText() + "8");
        }
        if (id == R.id.button_9) {
            if (tv.length() <= 6)
                tv.setText(tv.getText() + "9");
        }
        if (id == R.id.button_0) {
            if (tv.length() <= 6)
                tv.setText(tv.getText() + "0");
        }
        if (id == R.id.clear_button) {
            tv.setText(" ");
        }
    }

}
