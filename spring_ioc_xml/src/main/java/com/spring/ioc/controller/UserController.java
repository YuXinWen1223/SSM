package com.spring.ioc.controller;

import com.spring.ioc.service.UserService;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc.controller
 * @date :2022/12/1 14:04
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public void save(){
        userService.save();
    }
}
