package com.example.edu.jpeople.util;

/**
 * @author ASUS
 * @date 2018/11/1
 */

public enum EnumCode {
    /**
     * 成功
     */
    RIGHT("2000","成功"),
    /**
     * 返回数据为空
     */
    NOTHING("4001","数据为空"),
    /**
     * 请求错误不符合要求
     */
    ERROR("4000","请求错误"),
    /**
     * 没有登录
     */
    LOGIN("4002","尚未登录");
    EnumCode(String code,String message) {
        this.code = code;
        this.message = message;
    }

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
