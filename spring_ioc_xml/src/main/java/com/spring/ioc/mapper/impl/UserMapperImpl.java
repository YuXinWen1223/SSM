package com.spring.ioc.mapper.impl;

import com.spring.ioc.mapper.UserMapper;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc.mapper.impl
 * @date :2022/12/1 14:16
 */
public class UserMapperImpl implements UserMapper {
    @Override
    public void save() {
        System.out.println("helloworld");
    }
}
