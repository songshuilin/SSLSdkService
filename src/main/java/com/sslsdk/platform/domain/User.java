package com.sslsdk.platform.domain;


/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/03--09:20
 */
public class User {

  private long uid;//用户id
  private String username;//用户名
  private String mid;//设备id
  private long gid;//游戏id
  private long chid;//渠道id
  private java.sql.Timestamp updateTime;//添加时间
  private java.sql.Timestamp regTime;//注册时间


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getUsernname() {
    return username;
  }

  public void setUsernname(String usernname) {
    this.username = usernname;
  }


  public String getMid() {
    return mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }


  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }


  public long getChid() {
    return chid;
  }

  public void setChid(long chid) {
    this.chid = chid;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

  public java.sql.Timestamp getRegTime() {
    return regTime;
  }

  public void setRegTime(java.sql.Timestamp regTime) {
    this.regTime = regTime;
  }

  @Override
  public String toString() {
    return "User{" +
            "uid=" + uid +
            ", username='" + username + '\'' +
            ", mid='" + mid + '\'' +
            ", gid=" + gid +
            ", chid=" + chid +
            ", updateTime=" + updateTime +
            ", regTime=" + regTime +
            '}';
  }
}
