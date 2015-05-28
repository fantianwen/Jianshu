package com.study.radasm.jianshu.Fragments.aspects;

import android.os.SystemClock;
import android.view.View;

import com.study.radasm.jianshu.Enums.LoadStatus;
import com.study.radasm.jianshu.Fragments.BaseNetFragment;

/**
 * Created by RadAsm on 15/5/27.
 */
public class LiveFragment extends BaseNetFragment {
    private static LiveFragment liveFragment;

    public LiveFragment(){

    }

    public static LiveFragment getInstance() {
        if(liveFragment==null){
            synchronized (LiveFragment.class){
                liveFragment=new LiveFragment();
            }
        }
        return liveFragment;
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
