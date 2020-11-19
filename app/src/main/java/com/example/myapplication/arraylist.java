package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class arraylist extends AppCompatActivity {
 ListView lv;

 int img[]={R.drawable.d1,R.drawable.d2,R.drawable.d3,R.drawable.d4,R.drawable.d5,R.drawable.a1,R.drawable.a5,R.drawable.a8};
 String actv[]={"eman ahmed","ali ahmed","hoda salem","tahany adel","fatama mohamed","eman ahmed","ali ahmed","hoda salem","tahany adel","fatama mohamed"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arraylist);

        lv=findViewById(R.id.test_list);

        ArrayList<String> names=new ArrayList<>();

        names.add("Eman Ahmed");
        names.add("Ali Ahmed");
        names.add("Hoda Salem");
        names.add("Tahany Adel");
        names.add("fatma Mohamed");
        names.add("Eman Ahmed");
        names.add("Ali Ahmed");
        names.add("Hoda Salem");
        names.add("Tahany Adel");
        names.add("fatma Mohamed");
        names.add("Eman Ahmed");
        names.add("Ali Ahmed");
        names.add("Hoda Salem");
        names.add("Tahany Adel");
        names.add("fatma Mohamed");



        My_Adapter adapter=new My_Adapter(this,names,actv,img);

        lv.setAdapter(adapter);







    }
}
