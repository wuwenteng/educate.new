package com.example.edu.jpeople.handle;

import com.example.edu.jpeople.bean.Result;
import com.example.edu.jpeople.exception.ResponseException;
import com.example.edu.jpeople.util.ErrorMessageEnum;
import com.example.edu.jpeople.util.ResultUtil;
import com.example.edu.jpeople.util.SetHeaders;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.nio.charset.Charset;

/**
 * @author ASUS
 * @date 2018/11/7
 *
 * 获取全局的exception
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = ResponseException.class)
    @ResponseBody
    public ResponseEntity getException(ResponseException e) {
        System.out.println(e.getClass().getName());
        System.out.println(e.getMessage());
        String message =  e.getMessage();
        System.out.println("message: " + message);

        return new ResponseEntity("error：错误 && " + message, SetHeaders.setEncoding(), HttpStatus.BAD_REQUEST);
//        if (e instanceof ResponseException) {
//            ResponseException responseException = (ResponseException) e;
//            return ResultUtil.error(responseException.getCode(),responseException.getMessage());
//        } else {
//            String excClass = e.getClass().getName();
//            System.out.println(excClass);
//            if ("org.springframework.http.converter.HttpMessageNotReadableException".equals(excClass)) {
//                return ResultUtil.error(ErrorMessageEnum.HttpMessageNotReadableException);
//            } else {
//                return ResultUtil.error(ErrorMessageEnum.SYSTEM_ERROR);
//            }
//        }

        //return ResultUtil.error(ErrorMessageEnum.SYSTEM_ERROR);
    }
}
