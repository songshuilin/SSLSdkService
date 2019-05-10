package com.sslsdk.platform.controller;

import com.sslsdk.platform.domain.ResponseBean;
import com.sslsdk.platform.domain.User;
import com.sslsdk.platform.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Timestamp;
import java.util.List;

/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/03--10:18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServer userServer;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public ResponseBean addUser(String name){
        java.util.Date date=new java.util.Date();
        User user =new User();
        user.setChid(123);
        user.setGid(1234);
        user.setMid("mid");
        user.setUpdateTime(new Timestamp(date.getTime()));
        user.setUsernname("老五");
        user.setRegTime(new Timestamp(date.getTime()));

        int t=userServer.addUser(user);
        if (t==1){
            return new ResponseBean(200,"success","addUser success");
        }else {
            return new ResponseBean(100,"faiil","addUser faiil");
        }
    }

    @RequestMapping(value = "/delete" ,method = RequestMethod.GET)
    public ResponseBean deleteUserById(int uid){
        int t=userServer.deleteUserById(uid);
        if (t==1){
            return new ResponseBean(200,"success","deleteUserById success");
        }else {
            return new ResponseBean(101,"faiil","deleteUserById fail");
        }
    }

    @RequestMapping(value = "/findAll" ,method = RequestMethod.GET)
    public ResponseBean findUserAll(){
        List<User>  users= userServer.findUserAll();
        return new ResponseBean(200,"查询成功",users);
    }
}
