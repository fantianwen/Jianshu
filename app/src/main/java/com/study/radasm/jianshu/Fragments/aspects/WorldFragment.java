package com.study.radasm.jianshu.Fragments.aspects;

import android.os.SystemClock;
import android.view.View;

import com.study.radasm.jianshu.Enums.LoadStatus;
import com.study.radasm.jianshu.Fragments.BaseNetFragment;
import com.study.radasm.jianshu.Models.NetResult;

/**
 * Created by RadAsm on 15/5/27.
 */
public class WorldFragment extends BaseNetFragment {
    private static WorldFragment worldFragment;

    public WorldFragment(){

    }

    public static WorldFragment getInstance() {
        if(worldFragment==null){
            synchronized (AllFragment.class){
                worldFragment=new WorldFragment();
            }
        }
        return worldFragment;
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
