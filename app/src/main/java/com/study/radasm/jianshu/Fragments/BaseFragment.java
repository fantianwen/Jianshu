package com.study.radasm.jianshu.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 基类
 * <p/>
 * Created by RadAsm on 15/5/27.
 */
public abstract class BaseFragment extends Fragment {
    public Context mContext;

    public BaseFragment() {
        this.mContext = getActivity();
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
