package com.example.edu.jpeople.util;

/**
 * @author ASUS
 * @date 2018/11/7
 */
public enum ErrorMessageEnum {
    /**
     * 成功
     */
    SUCCESS("200","正常返回"),
    /**
     * 系统错误
     */
    SYSTEM_ERROR("500", "系统错误"),
    /**
     * 参数异常
     */
    HttpMessageNotReadableException("501", "请求信息体参数异常"),

    MissingServletRequestParameter("505","请求参数异常"),
    /**
     * 数据不完整
     */
    DATA_NO_COMPLETE("502", "数据填写不完整"),
    /**
     * 用户不存在
     */
    USER_NOT_FIND("503", "用户不存在"),
    /**
     * 数据为空
     */
    NO_DATA("504","数据为空");

    private ErrorMessageEnum(String code, String message) {
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
