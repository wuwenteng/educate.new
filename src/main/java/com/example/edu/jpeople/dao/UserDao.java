package com.example.edu.jpeople.dao;

import com.example.edu.jpeople.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ASUS
 * @date 2018/10/26
 */
@Transactional(rollbackFor = Exception.class)
public interface UserDao extends JpaRepository<User,Integer> {

    /**
     * 按id查找user
     * @param id userId
     * @return user
     */
    User findById(int id);

    /**
     * 按角色查找用户
     * @param role 角色
     * @return list 用户列表
     */
    List<User> findByRole(String role);

    /**
     * 按用户名查找用户
     * @param username 用户名
     * @return User 用户信息
     */
    User findByUsername(String username);
}
