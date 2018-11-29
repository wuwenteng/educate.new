package com.example.edu.jpeople;

import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.example.edu.jpeople.mapper")
public class JpeopleApplicationTests {

}
