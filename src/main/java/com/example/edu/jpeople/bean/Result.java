package com.example.edu.jpeople.bean;

import lombok.Data;

import java.util.List;

/**
 * @author ASUS
 * @date 2018/10/26
 */
@Data
public class Result<T> {
    private List<T> data;
    private String code;
    private String message;
    private User user;
    public Result () {}
    public Result(String code, String message){
        this.code = code;
        this.message = message;
    }
}
