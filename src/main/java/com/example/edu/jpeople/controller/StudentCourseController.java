package com.example.edu.jpeople.controller;

import com.example.edu.jpeople.bean.Result;
import com.example.edu.jpeople.bean.StudentCourse;
import com.example.edu.jpeople.dao.UserDao;
import com.example.edu.jpeople.service.StudentCourseService;
import com.example.edu.jpeople.service.UserService;
import com.example.edu.jpeople.util.Cover;
import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author ASUS
 * @date 2018/10/26
 */
@Controller
@RequestMapping(value = "/alreadyLogin")
public class StudentCourseController {
    @Autowired
    StudentCourseService studentCourseService;
    @Autowired
    UserDao userDao;

    /**
     * 查找所有选课记录
     * @return listAll
     */
    @GetMapping("/studentCourses")
    @ResponseBody
    public ResponseEntity listAll() {

        List<StudentCourse> studentCourseList = studentCourseService.list();
        try {
            Preconditions.checkNotNull(studentCourseList);
            return ResponseEntity.ok(studentCourseList);
        } catch (NullPointerException e) {
            return  ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("选课为空");
        }
    }

    /**
     * 查找某一学生的选课记录
     * @param studentId 学生id
     * @return result.data是学生的选课记录
     */
    @GetMapping("/students/{studentId}/studentCourses")
    @ResponseBody
    public ResponseEntity getStudentCourses(@PathVariable int studentId) {

        List<StudentCourse> studentCourseList = studentCourseService.studentCourseList(studentId);

        try {
            Preconditions.checkNotNull(studentCourseList);
            return ResponseEntity.ok(studentCourseList);
        } catch (NullPointerException e) {
            return ResponseEntity.status(409).body("该学生没有选课记录");
        }
    }

    /**
     * 获取选择某一课程的学生选课列表
     * @param courseId 课程id
     * @return result.data 选课列表
     * url中的/teachers/{teacherId}不要，因为传入的id没有用处
     */
    @GetMapping(value = "/courses/{courseId}/studentCourses")
    public ResponseEntity getTeacherCourses(@PathVariable int courseId) {

        List<StudentCourse> studentCourseList = studentCourseService.listByCourse(courseId);

        try {
            Preconditions.checkNotNull(studentCourseList);
            return ResponseEntity.ok(studentCourseList);
        } catch (NullPointerException e) {
            return ResponseEntity.badRequest().body("空");
        }
    }

    /**
     * 保存选课记录
     * @param studentCourse 选课记录
     * @return result
     */
    @PostMapping(value = "/studentCourses")
    @ResponseBody
    public ResponseEntity create(@Valid @RequestBody StudentCourse studentCourse, BindingResult bindingResult) {

        try {
            int id = studentCourseService.save(studentCourse);
            StudentCourse studentCourse1 = studentCourseService.get(id);
            return ResponseEntity.ok(studentCourse1);
        } catch (Exception e) {
            return ResponseEntity.status(409).body("保存失败");
        }
    }

    /**
     * 删除一条记录
     * @param id 记录id
     * @return code =200 成功
     */
    @DeleteMapping(value = "/studentCourses/{id}")
    @ResponseBody
    public ResponseEntity delete(@PathVariable int id) {
        StudentCourse studentCourse = studentCourseService.get(id);
        try {
            Preconditions.checkNotNull(studentCourse);
            return ResponseEntity.ok("删除成功");
        } catch (NullPointerException e) {
            return ResponseEntity.status(400).body("没有该记录");
        }
    }

    /**
     * 更新
     * @param id 要更新的记录id
     * @param studentCourse 更新的内容
     * @return 成功或失败
     */
    @PutMapping(value = "/studentCourses/{id}")
    @ResponseBody
    public ResponseEntity update(@PathVariable int id, @Valid @RequestBody StudentCourse studentCourse) {
        StudentCourse studentCourseOri = studentCourseService.get(id);
        try {
            Preconditions.checkNotNull(studentCourseOri);
        } catch (NullPointerException e) {
            return ResponseEntity.badRequest().body("没有原始信息");
        }

        try {
            Cover cover = new Cover();
            cover.coverStudentCourse(studentCourseOri,studentCourse);

            int scId = studentCourseService.save(studentCourseOri);
            return ResponseEntity.ok(studentCourseOri);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("更新成功");
        }
    }
}
