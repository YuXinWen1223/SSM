package com.spring.ioc;

import com.spring.ioc.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc
 * @date :2022/12/1 14:23
 * <p>
 * 自动装配方式：byName
 * byName：将自动装配的属性的属性名，作为bean的id在IOC容器中匹配相对应的bean进行赋值
 * 使用bean标签的autowire属性设置自动装配效果
 * 自动装配方式：byType
 * byType：根据类型匹配IOC容器中的某个兼容类型的bean，为属性自动赋值
 * 若在IOC中，没有任何一个兼容类型的bean能够为属性赋值，则该属性不装配，即值为默认值
 * null
 * 若在IOC中，有多个兼容类型的bean能够为属性赋值，则抛出异常
 * NoUniqueBeanDefinitionException
 */
public class Aout {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("atou.xml");
        UserController bean = context.getBean(UserController.class);
        bean.save();

    }

}
