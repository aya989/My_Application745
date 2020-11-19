package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class My_Adapter extends BaseAdapter {
    Context context;
    ArrayList<String> data;
    String ractv[];
    int rimg[];

    public My_Adapter(Context c ,ArrayList<String> data ,String actv[],int imag[])
    {

        this.context=c;
        this.data=data;
        this.ractv=actv;
        this.rimg=imag;
    }
    @Override
    public int getCount() {
        return data.size();

    }

    @Override
    public String getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        View v=view;
        if(v==null)
        {
           v = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1,null,false);


        }
        TextView tv =v.findViewById(android.R.id.text1);
        String name= getItem(i);

        tv.setText(name);

        return v;
    }
}
