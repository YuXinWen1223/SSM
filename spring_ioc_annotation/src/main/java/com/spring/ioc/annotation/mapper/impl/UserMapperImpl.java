package com.spring.ioc.annotation.mapper.impl;


import com.spring.ioc.annotation.mapper.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc.mapper.impl
 * @date :2022/12/1 14:16
 */
@Repository
public class UserMapperImpl implements UserMapper {
    @Override
    public void save() {
        System.out.println("helloworld");
    }
}
