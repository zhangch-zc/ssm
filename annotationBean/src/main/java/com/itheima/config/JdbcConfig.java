package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//@Configuration
@PropertySource({"jdbc.properties"})
public class JdbcConfig {
    //1.定义一个方法获得要管理的对象
//    @Value("com.mysql.jdbc.Driver")
//    private String driver;
//    @Value("jdbc:mysql://localhost:3306/spring_db")
//    private String url;
//    @Value("root")
//    private String userName;
//    @Value("root")
//    private String password;
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;
    //2.添加@Bean，表示当前方法的返回值是一个bean
    //@Bean修饰的方法，形参根据类型自动装配
    @Bean
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao);
//        System.out.println(driver);
//        System.out.println(url);
//        System.out.println(userName);
//        System.out.println(password);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
