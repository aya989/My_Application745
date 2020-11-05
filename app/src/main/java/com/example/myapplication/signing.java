package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signing extends AppCompatActivity {
   Button sgn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signing);

        sgn1=findViewById(R.id.sign1);

        sgn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent l2=new Intent(signing.this,enterpage.class);
                startActivity(l2);
            }
        });
    }
}
