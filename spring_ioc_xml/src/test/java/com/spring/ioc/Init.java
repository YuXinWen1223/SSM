package com.spring.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc
 * @date :2022/12/1 10:34
 */
public class Init {
    @Test
    public void testInit() {
        //多例不执行，单例执行但不执行销毁方法
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
        /**
         User bean = context.getBean(User.class);
         System.out.println(bean);
         context.close();
        */
    }
}
