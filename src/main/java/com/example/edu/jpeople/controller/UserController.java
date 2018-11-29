package com.example.edu.jpeople.controller;

import com.example.edu.jpeople.bean.User;
import com.example.edu.jpeople.custom.Permission;
import com.example.edu.jpeople.custom.Verify;
import com.example.edu.jpeople.dao.UserDao;
import com.example.edu.jpeople.service.UserService;
import com.example.edu.jpeople.util.Cover;
import com.example.edu.jpeople.util.SetHeaders;
import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.nio.charset.Charset;
import java.util.List;

/**
 * @author ASUS
 * @date 2018/10/26
 */
@RestController
@RequestMapping(value = "/alreadyLogin")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserDao userDao;

    /**
     * 保存用户
     * @param user 用户
     * @return result
     */
    @PostMapping(value = "/users")
    @ResponseBody
    public ResponseEntity create(@Valid @RequestBody User user, BindingResult bindingResult) {

        try {
            Assert.notNull(user.getImagePath(),"user不为空");
            int id = userService.save(user);
            User user1 = userService.get(id);
            return new ResponseEntity(user1,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity("保存失败",SetHeaders.setEncoding(),HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * 获取某一用户的信息
     * @param userId 用户id
     * @return result
     */
    @GetMapping(value = "/users/{userId}")
    @ResponseBody

    public ResponseEntity get(@PathVariable int userId) {
        try {
            User user = userService.get(userId);
            if (user != null) {
                return ResponseEntity.ok(user);
            } else {
                return ResponseEntity.badRequest().body("没有该用户");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("获取用户信息错误");
        }


    }

    /**
     * 获取不同角色的user列表
     * @param role 角色
     * @return result
     */
    @GetMapping(value = "/users")
    public ResponseEntity list(@Verify String role) {
        try {
            System.out.println(role);
            Preconditions.checkNotNull(role);
        } catch (Exception e) {
            System.out.println(e.getClass());
            return new ResponseEntity("参数不正确", SetHeaders.setEncoding(), HttpStatus.BAD_REQUEST);
        }

        List<User> users = userService.list(role);

        try {
            Preconditions.checkArgument(users.size()>0);
            System.out.println(users.size());
            return ResponseEntity.ok(users);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity("用户列表为空",SetHeaders.setEncoding(),HttpStatus.BAD_REQUEST);
        }
        //return result;
    }

    /**
     * 删除用户，老师级联删除课程表和选课表，学生级联删除选课表
     * @param userId 用户id
     * @return result
     */
    @DeleteMapping(value = "/users/{userId}")
    @ResponseBody
    @Permission
    public ResponseEntity delete(@PathVariable int userId) {

        User user = userService.get(userId);

        try {
            Preconditions.checkNotNull(user);

        } catch (NullPointerException e) {
            return new ResponseEntity("没有该用户",SetHeaders.setEncoding(),HttpStatus.BAD_REQUEST);
        }
        try {
            userService.delete(userId);
            return new ResponseEntity("删除成功",SetHeaders.setEncoding(),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity("删除失败",SetHeaders.setEncoding(),HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * 更新用户的信息
     * @param user 更新的用户
     * @param userId 被更的用户的id
     * @return result
     */
    @PutMapping(value = "/users/{userId}")
    @ResponseBody
    @Permission
    public ResponseEntity update(@Valid @RequestBody User user, @PathVariable int userId) {

        // int userIdInt = Integer.parseInt(userId);
        User userOri = userDao.findById(userId);

        try {
            Preconditions.checkNotNull(userOri);
        } catch (NullPointerException e) {
            return ResponseEntity.badRequest().body("没有该用户原始信息");
        }

        try {
            Cover cover = new Cover();
            cover.coverUser(userOri,user);
            userService.save(userOri);
            return ResponseEntity.ok("成功");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("保存失败");
        }
    }

}
