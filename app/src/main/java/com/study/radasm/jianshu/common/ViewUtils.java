package com.study.radasm.jianshu.common;

import android.content.Context;
import android.view.View;

/**
 * Created by RadAsm on 15/5/28.
 */
public class ViewUtils {
    public static View inflate(Context ctx,int layout_id){
        View view=View.inflate(ctx,layout_id,null);
        return view;
    }
}
