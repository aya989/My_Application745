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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arraylist);

        lv=findViewById(R.id.test_list);

        ArrayList<Userlist> values=new ArrayList<>();

        values.add(new Userlist("aya","17s"));
        values.add(new Userlist("asmaa","active"));
        values.add(new Userlist("hoda","4h"));
        values.add(new Userlist("mariem","active"));
        values.add(new Userlist("ahmed","13h"));
        values.add(new Userlist("ali","22m"));
        values.add(new Userlist("mahmoud","16s"));
        values.add(new Userlist("mena","45m"));
        values.add(new Userlist("noha","active"));




        My_Adapter adapter=new My_Adapter(this,R.layout.layoutlist,values);

        lv.setAdapter(adapter);







    }
}
