package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class enterpage extends AppCompatActivity {
ImageView hert1,hert2,hert3,hert4;
private int carrent_color;
int[]Images={R.drawable.heart,R.drawable.heart2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterpage);

        hert1=(ImageView)findViewById(R.id.h1);
        hert2=(ImageView)findViewById(R.id.h2);
        hert3=(ImageView)findViewById(R.id.h3);
        hert4=(ImageView)findViewById(R.id.h4);


    }

    public void red(View view)
    {
        hert1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        carrent_color++;
                        carrent_color=carrent_color% Images.length;
                        hert1.setImageResource(Images[carrent_color]);
                    }
                }
        );


    }


    public void red2(View view)
    {
        hert2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        carrent_color++;
                        carrent_color=carrent_color% Images.length;
                        hert2.setImageResource(Images[carrent_color]);
                    }
                }
        );


    }


    public void red3(View view)
    {
        hert3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        carrent_color++;
                        carrent_color=carrent_color% Images.length;
                        hert3.setImageResource(Images[carrent_color]);
                    }
                }
        );


    }


    public void red4(View view)
    {
        hert4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        carrent_color++;
                        carrent_color=carrent_color% Images.length;
                        hert4.setImageResource(Images[carrent_color]);
                    }
                }
        );


    }
}
