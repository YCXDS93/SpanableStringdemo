package com.baway.fuzhiyan.fuzhiyan20170821;

import android.app.Application;


public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
