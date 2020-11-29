package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class My_Adapter extends ArrayAdapter<Userlist> {
    Context context;
    int resorce;




    public My_Adapter(@NonNull Context context, int resource, @NonNull List<Userlist> objects) {
        super(context, resource, objects);

        this.context=context;
        this.resorce=resource;


    }




    @Override
    public long getItemId(int position) {
        return 0;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


     convertView = LayoutInflater.from(context).inflate(resorce,parent,false);

     TextView tvname=(TextView) convertView.findViewById(R.id.tvname);
     TextView tvactive=(TextView) convertView.findViewById(R.id.tvactive);

     Userlist curruser = getItem(position);

        tvname.setText(curruser.getName());
        tvactive.setText(curruser.getActivity());



        return convertView;






    }
}
