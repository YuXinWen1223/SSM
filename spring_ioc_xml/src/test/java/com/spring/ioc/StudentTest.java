package com.spring.ioc;

import com.spring.ioc.entity.Clazz;
import com.spring.ioc.entity.Student;
import com.spring.ioc.service.StudentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc
 * @date :2022/11/25 14:17
 */
public class StudentTest {
    /**
     * 根据类型来获取bean时，在满足bean唯一性的前提下，
     * 其实只是看：『对象 instanceof 指定的类型』的返回结果，
     * 只要返回的是true就可以认定为和类型匹配，能够获取到。
     */
    @Test
    public void testStudent() {
        //获取上下文IOC配置
        ClassPathXmlApplicationContext co = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //根据Bean的名称获取Bean，就是配置标签的id名称
        //TODO 由于 id 属性指定了 bean 的唯一标识，所以根据 bean 标签的 id 属性可以精确获取到一个组件对象。
        Student student = (Student) co.getBean("StudentOne");
        System.out.println(student);
        //根据Bean的类型获取。若有多个类型会报错 NoUniqueBeanDefinitionException
        //TODO 当根据类型获取bean时，要求IOC容器中指定类型的bean有且只能有一个
//        Student bean = co.getBean(Student.class);
//        System.out.println(bean);
        //根据Bean的类型和ID获取
        Student studentOne = co.getBean("StudentOne", Student.class);
        System.out.println(studentOne);
        //接口可以被……类实现后，然后通过该接口类型获取不会报错
        StudentService coBean = co.getBean("StudentOne", StudentService.class);
        System.out.println(coBean);
    }

    /**
     * set注入
     */
    @Test
    public void testStudent2() {
        //获取上下文IOC配置
        ClassPathXmlApplicationContext co = new ClassPathXmlApplicationContext("spring-ioc.xml");
        StudentService coBean = co.getBean("StudentOne", StudentService.class);
        System.out.println(coBean);
    }

    /**
     * 构造方法注入，在xml用标签
     * <constructor-arg value="1"/>
     * <constructor-arg value="李四"/>
     * <constructor-arg value="123@qq.com"/>
     * <constructor-arg value="20"/>
     */
    @Test
    public void testStudent3() {
        //获取上下文IOC配置
        ClassPathXmlApplicationContext co = new ClassPathXmlApplicationContext("spring-ioc.xml");
        StudentService coBean = co.getBean("StudentTwo", StudentService.class);
        System.out.println(coBean);
    }

    /**
     * 设置属性
     * <property name="sid" value="1"/>
     * <property name="email">
     * <null/>
     * </property>
     * <property name="name" value=" &lt;张三 &gt;"/>
     * <property name="age" value="18"/>
     */
    @Test
    public void testStudent4() {
        //获取上下文IOC配置
        ClassPathXmlApplicationContext co = new ClassPathXmlApplicationContext("spring-ioc.xml");
        StudentService coBean = co.getBean("StudentThree", StudentService.class);
        System.out.println(coBean);
    }

    /**
     * 为类类型属性赋值
     */
    @Test
    public void testStudent5() {
        //获取上下文IOC配置
        ClassPathXmlApplicationContext co = new ClassPathXmlApplicationContext("spring-ioc.xml");
        StudentService coBean = co.getBean("StudentFour", StudentService.class);
        System.out.println(coBean);
    }

    /**
     * 为类类型属性内联赋值
     */
    @Test
    public void testStudent6() {
        //获取上下文IOC配置
        ClassPathXmlApplicationContext co = new ClassPathXmlApplicationContext("spring-ioc.xml");
        StudentService coBean = co.getBean("StudentFive", StudentService.class);
        System.out.println(coBean);
    }

    /**
     * 数组类型
     */
    @Test
    public void testStudent7() {
        //获取上下文IOC配置
        ClassPathXmlApplicationContext co = new ClassPathXmlApplicationContext("spring-ioc.xml");
        StudentService coBean = co.getBean("StudentSix", StudentService.class);
        System.out.println(coBean);
    }

    /**
     * 多对一赋值
     */
    @Test
    public void testStudent8() {
        //获取上下文IOC配置
        ClassPathXmlApplicationContext co = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Clazz coBean = co.getBean("clazzFour", Clazz.class);
        System.out.println(coBean);
    }

    /**
     * map映射
     */
    @Test
    public void testStudent9() {
        //获取上下文IOC配置
        ClassPathXmlApplicationContext co = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student coBean = co.getBean("StudentSeven", Student.class);
        System.out.println(coBean);
    }

    /**
     * p标签赋值
     */
    @Test
    public void testStudent10() {
        //获取上下文IOC配置
        ClassPathXmlApplicationContext co = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student coBean = co.getBean("StudentEight", Student.class);
        System.out.println(coBean);
    }
}
