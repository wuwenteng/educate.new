package com.example.edu.jpeople.service;

import com.example.edu.jpeople.bean.Course;
import com.example.edu.jpeople.bean.Result;
import com.example.edu.jpeople.bean.StudentCourse;
import com.example.edu.jpeople.bean.User;
import com.example.edu.jpeople.dao.CourseDao;
import com.example.edu.jpeople.dao.StudentCourseDao;
import com.example.edu.jpeople.dao.UserDao;
import com.example.edu.jpeople.util.EnumCode;
import com.example.edu.jpeople.util.EnumRole;
import com.example.edu.jpeople.util.GetException;
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
public class UserService {

    @Autowired
    UserDao userDao;
    @Autowired
    StudentCourseDao studentCourseDao;
    @Autowired
    CourseDao courseDao;

    public User get(int id) {
        return userDao.findById(id);
    }

    public int save(User user) {
        return userDao.save(user).getId();
    }

    public void delete(int id) {
        User user = userDao.findById(id);

        String role = user.getRole();
        if (role.equals(EnumRole.STUDENT.getName())) {
            List<StudentCourse> studentCourseList = studentCourseDao.findByStudentId(user.getId());
            deleteList(studentCourseList);
        } else if (role.equals(EnumRole.TEACHER.getName())) {
            List<Course> courses = courseDao.findByTeacherId(user.getId());
            for (Course course : courses) {
                List<StudentCourse> studentCourseList = studentCourseDao.findByCourseId(course.getId());
                deleteList(studentCourseList);
                courseDao.delete(course);
            }
        }
        userDao.delete(user);
    }

    public List<User> list(String role) {
        return userDao.findByRole(role);
    }

    public User getByUsername(String username) {
        return userDao.findByUsername(username);
    }

    private void deleteList(List<StudentCourse> list) {
        for (StudentCourse sc : list) {
            studentCourseDao.delete(sc);
        }
    }
}
