package com.example.edu.jpeople.login;

import com.example.edu.jpeople.bean.Result;
import com.example.edu.jpeople.bean.User;
import com.example.edu.jpeople.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author ASUS
 * @date 2018/11/1
 */
@Controller
public class Login {

    @Autowired
    HttpServletRequest request;
    @Autowired
    UserService userService;

    @PostMapping(value = "/login")
    @ResponseBody
    public ResponseEntity login(@RequestBody User userIn) {
        // String username = request.getParameter("username");
        Result result = new Result();
        User user = userService.getByUsername(userIn.getUsername());
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("id",user.getId());
            result.setCode("200");
            result.setUser(user);
        } else {
            result.setCode("400");
            result.setMessage("该用户尚未注册");
        }
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
