package com.study.radasm.jianshu.Fragments.aspects;


import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;

import com.study.radasm.jianshu.Enums.LoadStatus;
import com.study.radasm.jianshu.Fragments.BaseNetFragment;

/**
 * Created by RadAsm on 15/5/27.
 */
public class AllFragment extends BaseNetFragment {

    private static AllFragment allFragment;

    public AllFragment(){

    }

    public static AllFragment getInstance() {
        if(allFragment==null){
            synchronized (AllFragment.class){
                allFragment=new AllFragment();
            }
        }
        return allFragment;
    }


    private class MyHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {

        }
    }


    @Override
    protected View loadSuccessView() {
        return null;
    }

    @Override
    protected LoadStatus visitWeb() {
        SystemClock.sleep(4000);
        return LoadStatus.LOAD_FAILURE;
    }
}
