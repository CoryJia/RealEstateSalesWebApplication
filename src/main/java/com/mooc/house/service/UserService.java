package com.mooc.house.service;

import com.mooc.house.common.model.User;
import com.mooc.house.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserMapper userMapper;

    public List<User> getUsers(){
        return userMapper.selectUsers();
    }
}
