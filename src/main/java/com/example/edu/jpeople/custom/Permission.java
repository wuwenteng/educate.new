package com.example.edu.jpeople.custom;

import java.lang.annotation.*;

/**
 * @author ASUS
 * @date 2018/11/1
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Permission {
    // boolean isPermitted() default true;
}
