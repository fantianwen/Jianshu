package com.study.radasm.jianshu.Fragments.aspects;


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

    @Override
    protected View loadSuccessView() {
        return null;
    }

    @Override
    protected LoadStatus visitWeb() {
        return LoadStatus.LOAD_FAILURE;
    }
}
