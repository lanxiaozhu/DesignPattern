package com.gz.pro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
/**
 *
 * @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
 *
 spring boot默认会加载
 org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration类，
 DataSourceAutoConfiguration类使用了@Configuration注解向spring注入了dataSource bean。
 因为工程中没有关于dataSource相关的配置信息，
 当spring创建dataSource bean因缺少相关的信息就会报错。
 */