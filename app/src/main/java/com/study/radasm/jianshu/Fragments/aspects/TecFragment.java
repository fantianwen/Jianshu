package com.study.radasm.jianshu.Fragments.aspects;

import android.view.View;

import com.study.radasm.jianshu.Enums.LoadStatus;
import com.study.radasm.jianshu.Fragments.BaseNetFragment;

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

    @Override
    protected View loadSuccessView() {
        return null;
    }

    @Override
    protected LoadStatus visitWeb() {
        return LoadStatus.LOAD_FAILURE;
    }
}
