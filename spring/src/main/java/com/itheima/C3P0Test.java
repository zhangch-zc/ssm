package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class C3P0Test {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        ComboPooledDataSource comboPooledDataSource = (ComboPooledDataSource) ctx.getBean("comboPooledDataSource");
        System.out.println(comboPooledDataSource.toString());

    }
}
