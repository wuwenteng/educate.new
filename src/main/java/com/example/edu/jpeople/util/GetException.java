package com.example.edu.jpeople.util;

import com.example.edu.jpeople.bean.Result;
import com.example.edu.jpeople.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ASUS
 * @date 2018/11/1
 * 弃用
 */
public class GetException {

    @Autowired
    UserDao userDao;
    /**
     * 对 nullPointerException异常处理
     * @param result 自己包装过的返回类
     */
    public void getNullException(Result result) {
        result.setCode(EnumCode.NOTHING.getCode());
        result.setMessage(EnumCode.NOTHING.getMessage());
    }

}
