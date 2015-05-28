package com.study.radasm.jianshu.Fragments;

import android.view.View;

/**
 * Created by RadAsm on 15/5/27.
 */
public class SubscriptionFragment extends BaseFragment{
    private static SubscriptionFragment subscriptionFragment;

    public SubscriptionFragment() {

    }

    @Override
    protected View initView() {
        return null;
    }

    public static SubscriptionFragment getInstance(){
        if(subscriptionFragment==null){
            synchronized (SubscriptionFragment.class){
                if(subscriptionFragment==null){
                    subscriptionFragment=new SubscriptionFragment();
                }
            }
        }
        return subscriptionFragment;
    }
}
