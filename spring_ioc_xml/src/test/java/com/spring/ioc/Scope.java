package com.spring.ioc;

import com.spring.ioc.entity.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc
 * @date :2022/12/1 10:12
 */
public class Scope {
    @Test
    public void testScope() {
        //Bean 默认单例可在xml配置文件修改单例或者多例
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");
        Student bean = context.getBean(Student.class);
        Student bean2 = context.getBean(Student.class);
        System.out.println(bean.equals(bean2));
    }

}
