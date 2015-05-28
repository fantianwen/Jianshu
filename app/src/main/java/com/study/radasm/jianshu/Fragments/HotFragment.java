package com.study.radasm.jianshu.Fragments;

import android.view.View;

/**
 * Created by RadAsm on 15/5/27.
 */
public class HotFragment extends BaseFragment {

    private static HotFragment hotFragment;

    public HotFragment() {
    }

    @Override
    protected View initView() {
        return null;
    }

    public static HotFragment getInstance(){
        if(hotFragment==null){
            synchronized (HotFragment.class){
                if(hotFragment==null){
                    hotFragment=new HotFragment();
                }
            }
        }
        return hotFragment;
    }
}
