package com.example.edu.jpeople.util;

import com.example.edu.jpeople.bean.AdjustCurriculum;
import com.example.edu.jpeople.bean.Course;
import com.example.edu.jpeople.bean.StudentCourse;
import com.example.edu.jpeople.bean.User;

/**
 * @author ASUS
 * @date 2018/10/26
 * 更新时，赋值类
 */
public class Cover {
    public void coverUser(User oldUser, User newUser) {
        oldUser.setUsername(newUser.getUsername());
        oldUser.setPassword(newUser.getPassword());
        oldUser.setRole(newUser.getRole());
        oldUser.setCardId(newUser.getCardId());
        oldUser.setImagePath(newUser.getImagePath());
    }

    public void coverCourse(Course oldCourse, Course newCourse) {
        oldCourse.setCode(newCourse.getCode());
        oldCourse.setName(newCourse.getName());
        oldCourse.setPlace(newCourse.getPlace());
        oldCourse.setTime(newCourse.getTime());
        oldCourse.setTeacherId(newCourse.getTeacherId());
    }

    public void coverStudentCourse(StudentCourse oldOne, StudentCourse newOne) {
        oldOne.setCourseId(newOne.getCourseId());
        oldOne.setStudentId(newOne.getStudentId());
        oldOne.setScore(newOne.getScore());
    }

    public void coverAdjustCurriculum(AdjustCurriculum oldOne, AdjustCurriculum newOne) {
        oldOne.setApplicant(newOne.getApplicant());
        oldOne.setApprovedBy(newOne.getApprovedBy());
        oldOne.setBeReplacedCourseId(newOne.getBeReplacedCourseId());
        oldOne.setBeReplacedCourseName(newOne.getBeReplacedCourseName());
        oldOne.setReason(newOne.getReason());
        oldOne.setReplacedByCourseId(newOne.getReplacedByCourseId());
        oldOne.setReplacedByCourseName(newOne.getReplacedByCourseName());
        oldOne.setStatus(newOne.getStatus());
    }
}
