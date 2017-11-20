package com.mypro.beanDao;

import com.mypro.bean.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM tms_user_info where user_id = #{user_id}")
    @Results({
            @Result(property = "user_id", column = "user_id"),
            @Result(property = "user_name", column = "user_name"),
            @Result(property = "password", column = "password")
    })
    User findById(@Param("user_id") int user_id);


}
