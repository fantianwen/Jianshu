package com.study.radasm.jianshu;

import android.app.Application;
import android.util.Log;

/**
 * Created by RadAsm on 15/5/31.
 */
public class AppClient extends Application {

    private static final String TAG=AppClient.class.getSimpleName();
    private static AppClient appClient;

    @Override
    public void onCreate() {
        super.onCreate();
        appClient=new AppClient();
        if(appClient!=null){
            Log.e(TAG,"oncreate...");
        }

    }
    public static AppClient getInstance(){
        if(appClient==null){
            appClient=new AppClient();
        }
        return appClient;
    }
}
