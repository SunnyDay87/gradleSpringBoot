package com.mypro.mapper;

import com.mypro.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> getAll();

    User getUser(String user_id);

    void insert(User user);

    void update(User user);

    void delete(User user);
}
