package com.sslsdk.platform.dao;

import com.sslsdk.platform.domain.Game;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/08--19:12
 */
@Mapper
public interface GameMapper {

    /**
     * 添加游戏
     * @param game
     * @return
     */
    @Insert("insert into game(gid,gameName,apiNotify,secretKey,addTime)"
    +" values(#{gid} , #{gameName}, #{apiNotify}, #{secretKey},#{addTime}) "
    )
    int addGame(Game game);

    /**
     * 根据游戏id 查找游戏
     * @param gid
     * @return
     */
    @Select("select * from game where gid =  #{gid}" )
    Game findGameByGid(long gid);
}
