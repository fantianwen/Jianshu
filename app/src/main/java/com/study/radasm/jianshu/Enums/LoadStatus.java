package com.study.radasm.jianshu.Enums;

/**
 * Created by RadAsm on 15/5/28.
 */
public enum LoadStatus {

    /**
     * 枚举一定要卸载最前面，否则编译会发生错误
     */
    LOAD_SUCCESS(1),
    LOAD_FAILURE(2),
    LOAD_UNKNOWN(3);

    private int status_code;

    LoadStatus(int status_code) {
        this.status_code = status_code;
    }

    public int getStatus_code() {
        return status_code;
    }
}
