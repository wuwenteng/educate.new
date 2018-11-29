package com.example.edu.jpeople.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ASUS
 * @date 2018/10/26
 */
@Data
@Entity
@Table(name = "course")
//@ApiModel(value = "课程对象模型")
public class Course {
    @Id
    @GeneratedValue
    //@ApiModelProperty(value = "id",required = true)
    private Integer id;
    private String name;
    private String code;
    private String time;
    private String place;
    private int teacherId;
}
