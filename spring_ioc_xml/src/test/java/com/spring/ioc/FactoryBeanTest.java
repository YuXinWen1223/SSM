package com.spring.ioc;

import com.spring.ioc.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc
 * @date :2022/12/1 13:58
 */
public class FactoryBeanTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("factorybean.xml");
        User factoryBean = (User) context.getBean("factoryBean");
        System.out.println(factoryBean);
    }
}
