package com.sslsdk.platform.domain;

/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreatrTime 2019/04/02--20:56
 */
public class ResponseBean {
    private int code;// 状态码

    private  String msg;//返回的信息

    private Object data;// 返回的数据

    public ResponseBean(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

