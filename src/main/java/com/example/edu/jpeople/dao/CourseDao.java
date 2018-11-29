package com.example.edu.jpeople.dao;

import com.example.edu.jpeople.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ASUS
 * @date 2018/10/26
 */
public interface CourseDao extends JpaRepository<Course, Integer> {
    /**
     * 按id查找课程
     * @param id courseId
     * @return course
     */
    Course findById(int id);

    /**
     * 查询某位教师的开课情况
     * @param teacherId 教师id
     * @return list 课程列表
     */
    List<Course> findByTeacherId(int teacherId);
}
