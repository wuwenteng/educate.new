package com.example.edu.jpeople.bean;

import com.sun.javafx.image.IntPixelGetter;
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
@Table(name = "adjustcurriculum")
public class AdjustCurriculum {
    @Id
    @GeneratedValue
    private Integer id;
    private int beReplacedCourseId;
    private String beReplacedCourseName;
    private int replacedByCourseId;
    private String replacedByCourseName;
    private String status;
    private String reason;
    private int approvedBy;
    private int applicant;
}
