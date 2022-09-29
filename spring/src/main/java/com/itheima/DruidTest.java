package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DruidTest {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        DruidDataSource druidDataSource = (DruidDataSource) ctx.getBean("druidDataSource");
        System.out.println(druidDataSource.getUsername());

    }
}
