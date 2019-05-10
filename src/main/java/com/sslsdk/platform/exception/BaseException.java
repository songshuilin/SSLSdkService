package com.sslsdk.platform.exception;

/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/03--09:24
 */
public class BaseException extends  Exception{
    private int code;

    public BaseException(String message) {
       super(message);
    }

    public BaseException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
