package com.example.edu.jpeople.controller;

import com.example.edu.jpeople.bean.Course;
import com.example.edu.jpeople.bean.Result;
import com.example.edu.jpeople.bean.User;
import com.example.edu.jpeople.service.CourseService;
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
import javax.xml.ws.Response;
import java.util.List;

/**
 * @author ASUS
 * @date 2018/10/26
 */
@Controller
@RequestMapping(value = "/alreadyLogin")
//@Api(value = "对课程表的增删改查")
public class CourseController {
    @Autowired
    CourseService courseService;
    @Autowired
    UserService userService;

    /**
     * 列出所有课程
     * @return result
     */
    @GetMapping(value = "/courses")
    //@ApiOperation(value = "获取全部课程",notes = "只有result.code==200才为正确")
    public ResponseEntity listAll() {
        List<Course> courses = courseService.listAll();
        try {
            Preconditions.checkNotNull(courses);
            return ResponseEntity.ok(courses);
        } catch (NullPointerException e) {
            return ResponseEntity.status(408).body("没有课程");
        }
    }

    /**
     * 某一教师的开课列表
     * @param teacherId 教师id
     * @return result
     */
    @GetMapping(value = "/teachers/{teacherId}/courses")
    @ResponseBody
    //@ApiOperation(value = "根据教师id获取其开课列表")
    //@ApiImplicitParam(name = "teacherId",value = "教师id",paramType = "path",dataType = "int")
    public ResponseEntity listCourse(@PathVariable int teacherId) {

        List<Course> courses = courseService.findByTeacherId(teacherId);
        User user = userService.get(teacherId);
        try {
            Preconditions.checkNotNull(user);
        } catch (NullPointerException e) {
            return ResponseEntity.status(408).body("没有该教师");
        }

        try {
            Preconditions.checkNotNull(courses);
            return ResponseEntity.ok(courses);
        } catch (NullPointerException e) {
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("没有该用户");
        }
    }

    /**
     * 保存课程
     * @param course 要保存的课程
     * @return result
     */
    @PostMapping(value = "/courses")
    @ResponseBody
    public ResponseEntity create(@Valid @RequestBody Course course, BindingResult bindingResult) {
        try {
            int id = courseService.save(course);
            Course course1 = courseService.get(id);
            return ResponseEntity.ok(course1);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("更新失败");
        }

    }

    /**
     * 更新课程内容
     * @param course 更新的课程的全部内容
     * @param courseId 要更新的课程id
     * @return result
     */
    @PutMapping(value = "/courses/{courseId}")
    @ResponseBody
//    @ApiOperation(value = "更新信息",notes = "根据url的id来指定更新课程信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "courseId",value = "课程Id",required = true, dataType = "int",paramType = "path"),
//            @ApiImplicitParam(name = "course",value = "课程实体Course",required = true,paramType = "User")
//    })
    public ResponseEntity update(@Valid @RequestBody Course course, @PathVariable int courseId, BindingResult bindingResult) {

        Course courseOri = courseService.get(courseId);
        try {
            Preconditions.checkNotNull(courseOri);
        } catch (NullPointerException e) {
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("没有原始信息");
        }

        try {
            Cover cover = new Cover();
            cover.coverCourse(courseOri,course);
            //保存修改
            int id = courseService.save(courseOri);
            return ResponseEntity.ok(courseOri);
        } catch (Exception e) {
            return ResponseEntity.status(400).body("保存修改失败");
        }
    }

    /**
     * 删除课程
     * @param courseId 课程id
     * @return result
     */
    @DeleteMapping(value = "/courses/{courseId}")
    @ResponseBody
    public ResponseEntity delete(@PathVariable int courseId) {
        Course course = courseService.get(courseId);
        try {
            Preconditions.checkNotNull(course);
            // 同时应删除选课学生，在service中实现
            courseService.delete(course);
            return ResponseEntity.ok("删除成功");
        } catch (NullPointerException e) {
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("删除失败");
        }
    }
}
