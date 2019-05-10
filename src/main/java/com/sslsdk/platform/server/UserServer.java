package com.sslsdk.platform.server;

import com.sslsdk.platform.domain.User;

import java.util.List;

/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/03--09:40
 */
public interface UserServer {
    int addUser(User user);
    int deleteUserById(int uid);
    List<User> findUserAll();
}
