package com.study.radasm.jianshu.Fragments.aspects;

import android.os.SystemClock;
import android.view.View;

import com.study.radasm.jianshu.Enums.LoadStatus;
import com.study.radasm.jianshu.Fragments.BaseNetFragment;
import com.study.radasm.jianshu.Models.NetResult;

/**
 * Created by RadAsm on 15/5/27.
 */
public class TecFragment extends BaseNetFragment {
    private static TecFragment tecFragment;


    public TecFragment(){

    }

    public static TecFragment getInstance() {
        if(tecFragment==null){
            synchronized (TecFragment.class){
                tecFragment=new TecFragment();
            }
        }
        return tecFragment;
    }

    private NetResult netResult;

    @Override
    protected View loadSuccessView() {
        return null;
    }

    @Override
    protected NetResult visitWeb() {
        SystemClock.sleep(2000);
        netResult=new NetResult();
        netResult.loadStatus=LoadStatus.LOAD_FAILURE;
        return netResult;
    }
}
