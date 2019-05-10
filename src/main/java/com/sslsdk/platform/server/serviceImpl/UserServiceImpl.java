package com.sslsdk.platform.server.serviceImpl;

import com.sslsdk.platform.constant.Constants;
import com.sslsdk.platform.domain.User;
import com.sslsdk.platform.dao.UserMapper;
import com.sslsdk.platform.exception.ControllerException;
import com.sslsdk.platform.server.UserServer;
import org.springframework.stereotype.*;
import javax.annotation.Resource;
import java.util.List;


/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/03--09:38
 */
@Service
public class UserServiceImpl implements UserServer {

    @Resource
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        try {
            return userMapper.add(user);
        }catch (Exception ex){
           throw new ControllerException(Constants.ADD_FAILURE,"添加用户失败");
        }
    }

    @Override
    public int deleteUserById(int uid) {
        try {
            return userMapper.deleteUserById(uid);
        }catch (Exception ex){
            throw  new ControllerException(Constants.DELETE_FAILURE,"删除用户失败");
        }
    }

    @Override
    public List<User> findUserAll() {
        try {
            return userMapper.findUserAll();
        }catch (Exception ex){
           throw  new ControllerException(Constants.FIND_FAILURE,"查询用户失败");
        }
    }
}
