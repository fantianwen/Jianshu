package com.study.radasm.jianshu.Fragments.aspects;


import android.os.SystemClock;
import android.view.View;

import com.study.radasm.jianshu.Enums.LoadStatus;
import com.study.radasm.jianshu.Fragments.BaseNetFragment;

/**
 * Created by RadAsm on 15/5/27.
 */
public class ReadPicFragment extends BaseNetFragment {
    private static ReadPicFragment readPicFragment;

    public ReadPicFragment() {

    }

    public static ReadPicFragment getInstance() {
        if (readPicFragment == null) {
            synchronized (ReadPicFragment.class) {
                readPicFragment = new ReadPicFragment();
            }
        }
        return readPicFragment;
    }

    @Override
    protected View loadSuccessView() {
        return null;
    }

    @Override
    protected LoadStatus visitWeb() {
        SystemClock.sleep(4000);
        return LoadStatus.LOAD_FAILURE;
    }
}
