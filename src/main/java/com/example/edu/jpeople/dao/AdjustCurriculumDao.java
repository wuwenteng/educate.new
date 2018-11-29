package com.example.edu.jpeople.dao;

import com.example.edu.jpeople.bean.AdjustCurriculum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ASUS
 * @date 2018/10/27
 */

@Transactional(rollbackFor = Exception.class)
public interface AdjustCurriculumDao extends JpaRepository<AdjustCurriculum,Integer> {
    /**
     * 查找某一条记录
     * @param id 该条记录的id号
     * @return 记录
     */
    AdjustCurriculum findById(int id);

    /**
     * 查找某个学生的申请记录
     * @param applicant 学生id
     * @return 记录列表
     */
    List<AdjustCurriculum> findByApplicant(int applicant);

    /**
     * 根据审阅状态查找
     * @param status 状态
     * @return 列表
     */
    List<AdjustCurriculum> findByStatus(String status);
}
