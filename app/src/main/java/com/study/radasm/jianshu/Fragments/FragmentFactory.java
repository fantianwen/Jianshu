package com.study.radasm.jianshu.Fragments;

import com.study.radasm.jianshu.Fragments.aspects.AllFragment;
import com.study.radasm.jianshu.Fragments.aspects.LiveFragment;
import com.study.radasm.jianshu.Fragments.aspects.ReadPicFragment;
import com.study.radasm.jianshu.Fragments.aspects.TecFragment;
import com.study.radasm.jianshu.Fragments.aspects.WorldFragment;

/**
 * Created by RadAsm on 15/5/27.
 */
public class FragmentFactory implements AbstractFragmentFactory {

    private static final int ASPECTS=0x0000;
    private static final int HOT=0x0001;
    private static final int SUBSCRIPTION=0x0002;

    private static final int ASPECT_ALL=0x0010;
    private static final int ASPECT_WORLD=0x0011;
    private static final int ASPECT_READPIC=0x0012;
    private static final int ASPECT_LIVE=0x0013;
    private static final int ASPECT_TEC=0x0014;


    private static FragmentFactory fragmentFactory;
    private FragmentFactory(){

    }
    public static FragmentFactory getInstance(){
        if(fragmentFactory==null){
            synchronized (FragmentFactory.class){
                if(fragmentFactory==null){
                    fragmentFactory=new FragmentFactory();
                }
            }
        }
        return fragmentFactory;
    }


    @Override
    public BaseFragment createFragment(int position) {
        BaseFragment baseFragment=null;
        switch (position){
            /**main*/
            case ASPECTS:
                baseFragment=AspectsFragment.getInstance();
                break;
            case HOT:
                baseFragment=HotFragment.getInstance();
                break;
            case SUBSCRIPTION:
                baseFragment=SubscriptionFragment.getInstance();
                break;
            /**main*/

            /**Aspects*/
            case ASPECT_ALL:
                baseFragment= AllFragment.getInstance();
                break;
            case ASPECT_LIVE:
                baseFragment= LiveFragment.getInstance();
                break;
            case ASPECT_WORLD:
                baseFragment= WorldFragment.getInstance();
                break;
            case ASPECT_TEC:
                baseFragment= TecFragment.getInstance();
                break;
            case ASPECT_READPIC:
                baseFragment= ReadPicFragment.getInstance();
                break;
            /**Aspects*/
            default:
                break;
        }
        return baseFragment;
    }
}
