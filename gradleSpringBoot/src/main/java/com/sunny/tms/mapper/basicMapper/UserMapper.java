package com.sunny.tms.mapper.basicMapper;

import com.sunny.tms.entity.basicEntity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> getAllUsers();

    User getUser(String userId);

    int insert(User user);

    int update(User user);

    int delete(String userId);
}
