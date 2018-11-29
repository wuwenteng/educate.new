package com.example.edu.jpeople.exception;

import com.example.edu.jpeople.util.ErrorMessageEnum;

/**
 * @author ASUS
 * @date 2018/11/7
 */
public class ResponseException extends RuntimeException {
    private String code;

    /**
     * 继承exception 加入错误信息值
     * @param errorMessageEnum 错误信息
     */
    public ResponseException(ErrorMessageEnum errorMessageEnum) {
        super(errorMessageEnum.getMessage());
        this.code = errorMessageEnum.getCode();
    }

    /**
     * 自定义错误信息
     * @param code 错误状态值
     * @param message 错误信息
     */
    public ResponseException(String code, String message){
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
