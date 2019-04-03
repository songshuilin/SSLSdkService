package com.sslsdk.platform.exception;

/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreatrTime 2019/04/02--21:24
 */
public class ControllerException extends RuntimeException {
    private  String code;
    private  String msg;

    public ControllerException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
