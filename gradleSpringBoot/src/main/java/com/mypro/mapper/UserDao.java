package com.mypro.mapper;

import com.mypro.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("SELECT * FROM tms_user_info where user_id = #{user_id}")
    @Results({
            @Result(property = "user_id", column = "user_id"),
            @Result(property = "user_name", column = "user_name"),
            @Result(property = "password", column = "password")
    })
    User findById(@Param("user_id") int user_id);

    @Select(value={"select * from tms_user_info"})
    List<User> allUserList();


}
