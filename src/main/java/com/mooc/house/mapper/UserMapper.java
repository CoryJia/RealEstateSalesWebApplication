package com.mooc.house.mapper;


import com.mooc.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> selectUsers();
}
