package com.study.radasm.jianshu.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.study.radasm.jianshu.Fragments.BaseNetFragment;
import com.study.radasm.jianshu.Fragments.aspects.AllFragment;
import com.study.radasm.jianshu.Fragments.aspects.LiveFragment;
import com.study.radasm.jianshu.Fragments.aspects.ReadPicFragment;
import com.study.radasm.jianshu.Fragments.aspects.TecFragment;
import com.study.radasm.jianshu.Fragments.aspects.WorldFragment;

/**
 * Created by RadAsm on 15/5/27.
 */
public class TabPageIndicatorAdapter extends FragmentPagerAdapter {
    private Context context;
    private static final String[] ASPECT_TITLE = {"全部","世间事","读图","生活家","科技"};

    public TabPageIndicatorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        BaseNetFragment baseNetFragment = null;
        switch (position){
            case 0:
                baseNetFragment= AllFragment.getInstance();
                break;
            case 1:
                baseNetFragment= WorldFragment.getInstance();
                break;
            case 2:
                baseNetFragment= ReadPicFragment.getInstance();
                break;
            case 3:
                baseNetFragment= LiveFragment.getInstance();
                break;
            case 4:
                baseNetFragment= TecFragment.getInstance();
                break;
            default:
                break;
        }

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
