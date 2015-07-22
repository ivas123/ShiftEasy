package com.example.ivan.shift_easy;

import android.app.Application;
import android.content.Context;

/**
 * Created by Ivan on 2015-07-14.
 */
public class MyApplication extends Application {
    private static MyApplication sInstance;
    public void onCreate(){
        super.onCreate();
        sInstance = this;
    }
    public static MyApplication getInstance(){
        return sInstance;
    }
    public static Context getAppContext(){
        return  sInstance.getApplicationContext();
    }
}
