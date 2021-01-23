package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView IV;
    Button BTN;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTN = (Button) findViewById(R.id.BTN1);
        IV = (ImageView) findViewById(R.id.IV);
    }

    public void change_pic(View view) {

        int x = (int)(Math.random()*3)+1;
        if (x==1) {
            IV.setImageResource(R.drawable.one);
        }
        if (x == 2) {
            IV.setImageResource(R.drawable.two);
        }
        if (x == 3) {
            IV.setImageResource(R.drawable.three);
        }
        BTN.setText("your number is:" + x);

    }
}