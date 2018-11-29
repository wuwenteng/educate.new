package com.example.edu.jpeople.service;

import com.example.edu.jpeople.bean.StudentCourse;
import com.example.edu.jpeople.dao.StudentCourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ASUS
 * @date 2018/10/26
 */
@Service
@Transactional
public class StudentCourseService {
    @Autowired
    StudentCourseDao studentCourseDao;
    public StudentCourse get(int id) {
        return studentCourseDao.findById(id);
    }

    public List<StudentCourse> studentCourseList(int studentId) {
        return studentCourseDao.findByStudentId(studentId);
    }

    public List<StudentCourse> listByCourse(int courseId) {
        return studentCourseDao.findByCourseId(courseId);
    }

    public List<StudentCourse> list() {
        return studentCourseDao.findAll();
    }

    public int save(StudentCourse studentCourse) {
        return studentCourseDao.save(studentCourse).getId();
    }

    public void delete(StudentCourse studentCourse) {
        studentCourseDao.delete(studentCourse);
    }
}
