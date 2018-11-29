package com.example.edu.jpeople.util;

import com.example.edu.jpeople.bean.Result;
import com.example.edu.jpeople.bean.User;

import java.util.List;

/**
 * @author ASUS
 * @date 2018/11/7
 */
public class ResultUtil {
    /**
     * @param user 返回一个用户
     * @return result 自定义返回数据
     */
    public static Result success(User user) {
        Result result = new Result();
        result.setCode(ErrorMessageEnum.SUCCESS.getCode());
        result.setMessage("SUCCESS");
        result.setUser(user);
        return result;
    }

    /**
     * 操作成功
     * @return 返回自定义数据
     */
    public static Result success() {
        Result result = new Result();
        result.setCode(ErrorMessageEnum.SUCCESS.getCode());
        result.setMessage("SUCCESS");
        return result;
    }

    /**
     * 将自定义的枚举错误信息赋值给result
     * @param errorMessageEnum 自定义枚举错误信息
     * @return result 返回自定义信息
     */
    public static Result error(ErrorMessageEnum errorMessageEnum) {
        Result result = new Result();
        result.setCode(errorMessageEnum.getCode());
        result.setMessage(errorMessageEnum.getMessage());
        return result;
    }

    public static Result error(String code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
