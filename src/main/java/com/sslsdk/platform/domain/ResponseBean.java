package com.sslsdk.platform.domain;

/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/02--20:56
 */
public class ResponseBean {
    private int errno;// 状态码

    private  String error;//返回的信息

    private Object data;// 返回的数据

    public ResponseBean(int errno, String error, Object data) {
        this.errno = errno;
        this.error = error;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                "errno=" + errno +
                ", error='" + error + '\'' +
                ", data=" + data +
                '}';
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

