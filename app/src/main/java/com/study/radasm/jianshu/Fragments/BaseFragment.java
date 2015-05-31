package com.study.radasm.jianshu.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.radasm.jianshu.AppClient;

/**
 * 基类
 * <p/>
 * Created by RadAsm on 15/5/27.
 */
public abstract class BaseFragment extends Fragment {
    private static final String TAG=BaseFragment.class.getSimpleName();
    public Context mContext;

    public BaseFragment() {
        AppClient instance = AppClient.getInstance();
        if(instance==null){
            Log.e(TAG,"appclient is null");
        }
      //  this.mContext = instance.getApplicationContext();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = initView();
        return view;
    }

    protected abstract View initView();

}
