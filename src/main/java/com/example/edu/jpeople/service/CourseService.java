package com.example.edu.jpeople.service;

import com.example.edu.jpeople.bean.Course;
import com.example.edu.jpeople.bean.StudentCourse;
import com.example.edu.jpeople.dao.CourseDao;
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
public class CourseService {
    @Autowired
    CourseDao courseDao;
    @Autowired
    StudentCourseDao studentCourseDao;

    public Course get(int id) {
        return courseDao.findById(id);
    }

    public List<Course> findByTeacherId(int teacherId) {
        return courseDao.findByTeacherId(teacherId);
    }

    public List<Course> listAll() {
        return courseDao.findAll();
    }

    public int save(Course course) {
        return courseDao.save(course).getId();
    }

    public void delete(Course course) {
        List<StudentCourse> studentCourseList = studentCourseDao.findByCourseId(course.getId());
        for (StudentCourse sc : studentCourseList) {
            studentCourseDao.delete(sc);
        }
        courseDao.delete(course);
    }
}
