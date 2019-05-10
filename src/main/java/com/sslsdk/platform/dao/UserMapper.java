package com.sslsdk.platform.dao;

import com.sslsdk.platform.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;


/**
 * @program
 * @Desc
 * @Author 游戏人日常
 * @CreateTime 2019/04/03--08:18
 */
@Mapper
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     * @return
     */
    @Insert("insert into user(username,mid,gid,chid,updateTime,midRegTime,regTime)" +
            " values(#{username} ,#{mid} ,#{gid} ,#{chid} " +
            ",#{updateTime} ,#{midRegTime},#{regTime}) ")
    int add(User user);

    /**
     *  根据uid来删除用户
     * @param uid
     * @return
     */
    @Delete("delete from user where uid=#{uid}")
    int deleteUserById(int uid);


    /**
     * 查询所有用户
     */
    @Select("select  * from user")
    List<User> findUserAll();


}
