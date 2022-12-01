package com.spring.ioc.annotation.service.impl;

import com.spring.ioc.annotation.mapper.UserMapper;
import com.spring.ioc.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc.service.impl
 * @date :2022/12/1 14:06
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save() {
        userMapper.save();
    }
}
