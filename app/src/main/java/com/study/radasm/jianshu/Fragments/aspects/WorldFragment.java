package com.study.radasm.jianshu.Fragments.aspects;

import android.os.SystemClock;
import android.view.View;

import com.study.radasm.jianshu.Enums.LoadStatus;
import com.study.radasm.jianshu.Fragments.BaseNetFragment;

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

    @Override
    protected View loadSuccessView() {
        return null;
    }

    @Override
    protected LoadStatus visitWeb() {
        SystemClock.sleep(2000);
        return LoadStatus.LOAD_FAILURE;
    }
}
