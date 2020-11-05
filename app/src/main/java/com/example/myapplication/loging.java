package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loging extends AppCompatActivity {
Button log1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loging);

        log1=findViewById(R.id.login1);

        log1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent l=new Intent(loging.this,enterpage.class);
                startActivity(l);
            }
        });
    }
}
