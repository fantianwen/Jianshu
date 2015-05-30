package com.study.radasm.jianshu.Fragments.aspects;


import android.os.SystemClock;
import android.view.View;

import com.study.radasm.jianshu.Enums.LoadStatus;
import com.study.radasm.jianshu.Fragments.BaseNetFragment;
import com.study.radasm.jianshu.Models.NetResult;

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


    private NetResult netResult;


    @Override
    protected View loadSuccessView(NetResult result) {
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
