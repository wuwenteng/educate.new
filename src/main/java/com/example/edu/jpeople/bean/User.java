package com.example.edu.jpeople.bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author ASUS
 * @date 2018/10/26
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    @NotBlank(message = "用户名不能为空")
    private String username;
    @Length(min = 2, max = 10, message = "密码长度在2-10之间")
    private String password;
    @NotBlank(message = "角色不能为空")
    private String role;

    @NotBlank(message = "学号唯一且不为空")
    private String cardId;
    private String imagePath;

    public User() {
        super();
    }

    public User(String username, String password, String role,String cardId) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.cardId = cardId;
    }
}
