package com.example.edu.jpeople.controller;

import com.example.edu.jpeople.bean.AdjustCurriculum;
import com.example.edu.jpeople.bean.Result;
import com.example.edu.jpeople.service.AdjustCurriculumService;
import com.example.edu.jpeople.util.Cover;
import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ASUS
 * @date 2018/10/27
 */

@Controller
@RequestMapping(value = "/alreadyLogin")
public class AdjustCurriculumController {
    @Autowired
    AdjustCurriculumService adjustCurriculumService;

    /**
     * 查找某一条记录
     * @param id 记录得id
     * @return 一条记录包装在result中
     */
    @GetMapping(value = "/adjustCurriculums/{id}")
    public ResponseEntity getOne(@PathVariable int id) {

        AdjustCurriculum adjustCurriculum = adjustCurriculumService.getOne(id);
        try {
            Preconditions.checkNotNull(adjustCurriculum);
            return ResponseEntity.ok(adjustCurriculum);
        } catch (NullPointerException e) {
            return ResponseEntity.badRequest().body("没有该条记录");
        }
    }

    /**
     * 查询某一学生的申请记录
     * @param id 学生id
     * @return 记录列表
     */
    @GetMapping("/students/{id}/adjustCurriculums")
    @ResponseBody
    public ResponseEntity getByApplication(@PathVariable int id) {

        List<AdjustCurriculum> list = adjustCurriculumService.getByApplicant(id);
        try {
            Preconditions.checkNotNull(list);
            return ResponseEntity.ok(list);
        } catch (NullPointerException e) {
            return ResponseEntity.badRequest().body("申请为空");
        }
    }

    /**
     * 获取所有的申请记录
     * @return list
     */
    @GetMapping(value = "/adjustCurriculums")
    @ResponseBody
    public ResponseEntity getAll() {

        List<AdjustCurriculum> list = adjustCurriculumService.getAll();
        try {
            Preconditions.checkNotNull(list);
            return ResponseEntity.ok(list);
        } catch (NullPointerException e) {
            return ResponseEntity.badRequest().body("申请记录为空");
        }
    }

    /**
     * 新建一条申请记录
     * @param adjustCurriculum 申请记录
     * @return result 保存成功code=200
     */
    @PostMapping(value = "/adjustCurriculums")

    public ResponseEntity create(@Valid @RequestBody AdjustCurriculum adjustCurriculum) {
        int id = adjustCurriculumService.save(adjustCurriculum);

        AdjustCurriculum ac = adjustCurriculumService.getOne(id);
        try {
            Preconditions.checkNotNull(ac);
            return ResponseEntity.ok(ac);
        } catch (NullPointerException e) {
            return ResponseEntity.badRequest().body("申请记录为空");
        }
    }

    /**
     * 更新
     * @param adjustCurriculum 要更新的内容
     * @param id 被更新的id
     * @return 成功/失败
     */
    @PutMapping(value = "/adjustCurriculums/{id}")
    @ResponseBody
    public Result update(@RequestBody AdjustCurriculum adjustCurriculum, @PathVariable int id) {
        Result result = new Result();
        AdjustCurriculum ac = adjustCurriculumService.getOne(id);
        if (ac != null) {
            Cover cover = new Cover();
            cover.coverAdjustCurriculum(ac,adjustCurriculum);
            int id2 = adjustCurriculumService.save(ac);
            if (id2 == id) {
                List<AdjustCurriculum> list = new ArrayList<>();
                list.add(ac);
                result.setCode("200");
                result.setData(list);
            } else {
                result.setCode("400");
                result.setMessage("更新失败，id号改变");
            }
        } else {
            result.setCode("400");
            result.setMessage("更新失败，没有该记录！");
        }
        return result;
    }

    /**
     * 删除
     * @param id 要删除的记录的id
     * @return 成功/失败
     */
    @DeleteMapping(value = "/adjustCurriculums/{id}")
    @ResponseBody
    public Result delete(@PathVariable int id) {
        Result result = new Result();
        AdjustCurriculum adjustCurriculum = adjustCurriculumService.getOne(id);
        if (adjustCurriculum != null) {
            adjustCurriculumService.delete(adjustCurriculum);
            result.setCode("200");
        } else {
            result.setCode("400");
            result.setMessage("删除失败，没有该条记录！");
        }
        return result;
    }
}
