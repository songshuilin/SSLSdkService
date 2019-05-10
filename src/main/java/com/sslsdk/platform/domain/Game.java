package com.sslsdk.platform.domain;

import java.sql.Timestamp;

/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/08--17:56
 */
public class Game {

  private long gid;//游戏id
  private String gameName;//游戏名
  private String apiNotify;//游戏支付回调地址
  private String secretKey;// 游戏key 加密用
  private java.sql.Timestamp addTime; //游戏添加时间

  public Game() {
  }

  public Game(long gid, String gameName, String apiNotify, String secretKey, Timestamp addTime) {
    this.gid = gid;
    this.gameName = gameName;
    this.apiNotify = apiNotify;
    this.secretKey = secretKey;
    this.addTime = addTime;
  }

  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }


  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }


  public String getApiNotify() {
    return apiNotify;
  }

  public void setApiNotify(String apiNotify) {
    this.apiNotify = apiNotify;
  }


  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  public java.sql.Timestamp getAddTime() {
    return addTime;
  }

  public void setAddTime(java.sql.Timestamp addTime) {
    this.addTime = addTime;
  }

}
