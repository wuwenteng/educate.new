package com.example.edu.jpeople.resolver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * @author ASUS
 * @date 2018/11/23
 */
@SpringBootApplication
public class VerifyConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        // 注册verifySolver参数解析器
        argumentResolvers.add(new VerifyArgumentResolver());
    }
}
