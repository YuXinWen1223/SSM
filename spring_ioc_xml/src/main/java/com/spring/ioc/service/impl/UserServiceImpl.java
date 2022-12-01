package com.spring.ioc.service.impl;

import com.spring.ioc.mapper.UserMapper;
import com.spring.ioc.service.UserService;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc.service.impl
 * @date :2022/12/1 14:06
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void save() {
        userMapper.save();
    }
}
