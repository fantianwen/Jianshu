package com.study.radasm.jianshu.Fragments;

import android.support.v4.view.ViewPager;
import android.view.View;

import com.study.radasm.jianshu.Adapters.TabPageIndicatorAdapter;
import com.study.radasm.jianshu.R;
import com.study.radasm.jianshu.common.ViewUtils;
import com.viewpagerindicator.TabPageIndicator;

/**
 * Created by RadAsm on 15/5/27.
 */
public class AspectsFragment extends BaseFragment{


    private static AspectsFragment aspectsFragment;

    public AspectsFragment() {
    }

    public static AspectsFragment getInstance(){
        if(aspectsFragment==null){
            synchronized (AspectsFragment.class){
                if(aspectsFragment==null){
                    aspectsFragment=new AspectsFragment();
                }
            }
        }
        return aspectsFragment;
    }


    private TabPageIndicator indicator;
    private ViewPager pager;
    private TabPageIndicatorAdapter tabPageIndicatorAdapter;

    @Override
    protected View initView() {
        View view = ViewUtils.inflate(getActivity(), R.layout.base_view_aspects);

        indicator = (TabPageIndicator) view.findViewById(R.id.indicator);
        pager = (ViewPager) view.findViewById(R.id.pager);

        tabPageIndicatorAdapter=new TabPageIndicatorAdapter(getFragmentManager());

        pager.setAdapter(tabPageIndicatorAdapter);
        /**这里需要最后进行关联*/
        indicator.setViewPager(pager);


        return view;
    }
}
