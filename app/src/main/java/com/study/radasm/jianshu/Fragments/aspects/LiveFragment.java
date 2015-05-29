package com.study.radasm.jianshu.Fragments.aspects;

import android.os.SystemClock;
import android.view.View;

import com.study.radasm.jianshu.Enums.LoadStatus;
import com.study.radasm.jianshu.Fragments.BaseNetFragment;
import com.study.radasm.jianshu.Models.NetResult;

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


    private NetResult netResult;

    @Override
    protected View loadSuccessView() {
        return null;
    }

    @Override
    protected NetResult visitWeb() {
        SystemClock.sleep(4000);
        netResult=new NetResult();
        netResult.loadStatus=LoadStatus.LOAD_FAILURE;
        return netResult;
    }
}
