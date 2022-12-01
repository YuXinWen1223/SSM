package com.spring.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc
 * @date :2022/11/25 13:54
 */
public class SpringIocTest {
    @Test
    public void ioc(){
        //从上下文获取配置，获取IOC配置
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC中的Bean根据名字获取
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.sayHello();
    }
}
