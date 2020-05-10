package com.eso.myapplication.utils;

import android.app.Application;

import com.eso.myapplication.roomdatabase.MyDataBase;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MyDataBase.init(this);
    }
}
