package com.spring.ioc.annotation.controller;


import com.spring.ioc.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc.controller
 * @date :2022/12/1 14:04
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void save(){
        userService.save();
    }
}
