package com.study.radasm.jianshu.Models;

import com.study.radasm.jianshu.Enums.LoadStatus;

/**
 * 网络返回数据接口
 *
 * Created by RadAsm on 15/5/29.
 */
public class NetResult<T> {

    public LoadStatus loadStatus;
    public T result;

}
