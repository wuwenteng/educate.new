package com.example.edu.jpeople.resolver;

import com.example.edu.jpeople.custom.Verify;
import com.example.edu.jpeople.exception.ResponseException;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ASUS
 * @date 20118/11/23
 */
public class VerifyArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        // 针对@Verify注释
        return parameter.hasParameterAnnotation(Verify.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest,
                                  WebDataBinderFactory binderFactory) {
        Object body = getRequestBody(webRequest,parameter);
        String paramType = parameter.getParameterType().getName();
        System.out.println("要求的参数类型：" + paramType);
        if ("".equals(body)) {
            System.out.println("参数为空");
            throw new ResponseException("407","parameter is null,参数为空");

        } else {
            String bodyType = body.getClass().getName();
            System.out.println("获取的参数类型：" + bodyType);
            if (bodyType.equals(paramType)) {
                System.out.println(body.toString());
                return body;
            } else {
                throw new ResponseException("408","data type is error,数据类型错误！");
            }
        }
    }

    private Object getRequestBody(NativeWebRequest webRequest,MethodParameter paramPart) {
        HttpServletRequest servletRequest = webRequest.getNativeRequest(HttpServletRequest.class);
        try {
            System.out.println("获取参数名：" + paramPart.getParameterName());
            System.out.println(servletRequest.getParameter(paramPart.getParameterName()));
            Object body = servletRequest.getParameter(paramPart.getParameterName());
            return servletRequest.getParameter(paramPart.getParameterName());

        } catch (NullPointerException e) {
            throw new ResponseException("401","no parameter,没有参数");
        }

    }
}
