package com.study.radasm.jianshu.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.study.radasm.jianshu.Fragments.BaseNetFragment;
import com.study.radasm.jianshu.Fragments.FragmentFactory;

/**
 * Created by RadAsm on 15/5/27.
 */
public class TabPageIndicatorAdapter extends FragmentPagerAdapter {
    private Context context;
    private static final String[] ASPECT_TITLE = new String[]{"全部", "世间事", "读图", "生活家", "科技"};

    public TabPageIndicatorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        int transPosition = position + 0x0010;
        BaseNetFragment baseNetFragment = (BaseNetFragment) FragmentFactory.getInstance().createFragment(transPosition);
        return baseNetFragment;
    }

    @Override
    public int getCount() {
        return ASPECT_TITLE.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return ASPECT_TITLE[position];
    }
}
