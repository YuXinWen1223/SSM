package com.spring.ioc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @author : yuxinwen
 * @mingcheng : SSM
 * @模块 : com.spring.ioc
 * @date :2022/11/25 17:39
 */
public class JdbcTest {
    /**
     * 数据库配置文件IOC注入
     *
     * @throws Exception
     */
    @Test
    public void jdbcTest() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        DataSource bean = context.getBean(DruidDataSource.class);
        System.out.println(bean.getConnection());

    }
}
