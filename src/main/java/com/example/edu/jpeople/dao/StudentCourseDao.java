package com.example.edu.jpeople.dao;

import com.example.edu.jpeople.bean.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ASUS
 * @date 2018/10/26
 */

@Transactional(rollbackFor = Exception.class)
public interface StudentCourseDao extends JpaRepository<StudentCourse, Integer> {
    /**
     * 查找某一条记录
     * @param id 选课记录的id
     * @return studentCourse
     */
    StudentCourse findById(int id);

    /**
     * 查找某门课的选课记录
     * @param courseId 课程id
     * @return list 选课列表
     */
    List<StudentCourse> findByCourseId(int courseId);

    /**
     * 查找学生选课记录
     * @param studentId 学生id
     * @return list 学生选课记录列表
     */
    List<StudentCourse> findByStudentId(int studentId);
}
