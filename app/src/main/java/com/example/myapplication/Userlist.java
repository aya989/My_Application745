package com.example.myapplication;

public class Userlist {
    private String name;
    private  String activity;





    public Userlist(String name,String activity) {
        this.name = name;
        this.activity=activity;
    }



    public String getName() {
        return name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setName(String name) {
        this.name = name;
    }







}
