package com.sslsdk.platform.controller;

import com.sslsdk.platform.domain.Game;
import com.sslsdk.platform.domain.ResponseBean;
import com.sslsdk.platform.server.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program
 * @Desc   初始化
 * @Author 游戏人日常
 * @CreateTime 2019/04/04--16:08
 */
@RestController
public class InitController {

    @Autowired
    GameService gameService;

    @RequestMapping(value = "/init")
    public ResponseBean init(long gid){
        System.out.println("init .......");
        Game game= gameService.findGameByGid(gid);
        return new ResponseBean(200,"init success",game);
    }
}
