package com.study.radasm.jianshu.Fragments;

/**
 * Created by RadAsm on 15/5/27.
 */
public interface AbstractFragmentFactory {
    BaseFragment createFragment(int position);
}
