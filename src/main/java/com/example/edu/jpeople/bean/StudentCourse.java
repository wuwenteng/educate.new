package com.example.edu.jpeople.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.security.KeyStore;

/**
 * @author ASUS
 * @date 2018/10/26
 */
@Data
@Entity
@Table(name = "studentcourse")
public class StudentCourse {

    @Id
    @GeneratedValue
    private Integer id;
    private int score;
    private int studentId;
    private int courseId;
}
