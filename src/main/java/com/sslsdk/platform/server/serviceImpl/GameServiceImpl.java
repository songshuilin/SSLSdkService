package com.sslsdk.platform.server.serviceImpl;

import com.sslsdk.platform.constant.Constants;
import com.sslsdk.platform.dao.GameMapper;
import com.sslsdk.platform.domain.Game;
import com.sslsdk.platform.domain.User;
import com.sslsdk.platform.exception.ControllerException;
import com.sslsdk.platform.server.GameService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/08--17:40
 */
@Service
public class GameServiceImpl implements GameService {

    @Resource
    GameMapper gameMapper;

    @Override
    public int addGame(Game game) {
        try {
           return gameMapper.addGame(game);
        }catch (Exception e){
            throw new ControllerException(Constants.ADD_FAILURE,"添加游戏失败");
        }
    }

    @Override
    public Game findGameByGid(long gid) {
        try {
            return  gameMapper.findGameByGid(gid);
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw new ControllerException(Constants.FIND_FAILURE,"查找游戏失败");
        }
    }
}
