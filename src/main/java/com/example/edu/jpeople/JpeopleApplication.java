package com.example.edu.jpeople;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ASUS
 */
@SpringBootApplication
@MapperScan("com.example.edu.jpeople.mapper")
public class JpeopleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpeopleApplication.class, args);
    }
}
