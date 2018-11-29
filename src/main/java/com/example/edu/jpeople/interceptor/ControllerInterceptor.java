package com.example.edu.jpeople.interceptor;

import com.example.edu.jpeople.bean.Result;
import com.example.edu.jpeople.util.SetHeaders;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author ASUS
 * @date 2018/10/31
 */

@Aspect
@Component
public class ControllerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(ControllerInterceptor.class);

    @Pointcut("execution(public * com.example.edu.jpeople.controller..*(..))")
    public void controllerOperation() {}

    @Before("controllerOperation()")
    public void doBefore(){
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        try {
            HttpServletRequest request = sra.getRequest();
            String url = request.getRequestURI();
            String method = request.getMethod();
            System.out.println("url:"+ url + ", 和 method =" + method);

        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    /**
     * 使用自定义注解 @Permission
     */
    @Pointcut("@annotation(com.example.edu.jpeople.custom.Permission)")
    public void loginInterceptor() {}

    @Around("loginInterceptor()")
    public Object doAround(ProceedingJoinPoint point) throws Throwable {

        try {
            String id = getUserId();
            String notEmpty = "false";
            if (id.equals(notEmpty)) {
                System.out.println("未登录");
                Result result = new Result();
                result.setMessage("未登录");
                return ResponseEntity.status(400).body(result);
            } else {
                return point.proceed();
            }
        } catch (NullPointerException e) {
            System.out.println(e.getClass());
            return new ResponseEntity("获取请求失败", SetHeaders.setEncoding(), HttpStatus.BAD_REQUEST);
        }

    }

    private String getUserId(){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
        HttpServletRequest request = servletRequestAttributes.getRequest();
        HttpSession session = request.getSession();
        try {
            String id = session.getAttribute("id").toString();
            if (id != null) {
                return id;
            }
            return "false";
        } catch (Exception e) {
            return "false";
        }
    }

    @Pointcut("@annotation(org.springframework.web.bind.annotation.PutMapping) || @annotation(org.springframework.web.bind.annotation.PostMapping)")
    public void catchError() { }

    @Around("catchError()")
    public ResponseEntity aroundCatch(ProceedingJoinPoint joinPoint) throws Throwable {

        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        BindingResult bindingResult = null;
        try {
            HttpServletRequest httpServletRequest = sra.getRequest();
            String method = httpServletRequest.getMethod();
            System.out.println("method:" + method);

            // 获取方法中的参数，找到BindingResult
            for (Object object : joinPoint.getArgs()) {
                if (object instanceof BindingResult) {
                    bindingResult = (BindingResult) object;
                }
            }
            if (bindingResult.hasErrors()) {
                List<ObjectError> list = bindingResult.getAllErrors();
                for (ObjectError error : list) {
                    System.out.println("异常信息：" + error.getDefaultMessage());
                }
                return new ResponseEntity(list.get(0).getDefaultMessage(),SetHeaders.setEncoding(),HttpStatus.BAD_REQUEST);
            } else {
                return (ResponseEntity) joinPoint.proceed();
            }
        } catch (Exception e) {
            return new ResponseEntity("获取请求失败",SetHeaders.setEncoding(),HttpStatus.BAD_REQUEST);
        }

    }

}
