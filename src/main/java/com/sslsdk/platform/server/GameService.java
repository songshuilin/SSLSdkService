package com.sslsdk.platform.server;

import com.sslsdk.platform.domain.Game;

/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/08--17:41
 */
public interface GameService {
    /**
     * 添加游戏
     * @param game
     * @return
     */
    public int addGame(Game game);

    /**
     * 根据游戏id 查找游戏
     * @param gid
     * @return
     */
    public Game findGameByGid(long gid);
}
