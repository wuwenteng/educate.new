package com.example.edu.jpeople.service;

import com.example.edu.jpeople.bean.AdjustCurriculum;
import com.example.edu.jpeople.dao.AdjustCurriculumDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ASUS
 * @date 2018/10/27
 */

@Service
@Transactional
public class AdjustCurriculumService {
    @Autowired
    AdjustCurriculumDao adjustCurriculumDao;

    public int save(AdjustCurriculum ac) {
        return adjustCurriculumDao.save(ac).getId();
    }

    public AdjustCurriculum getOne(int id) {
        return adjustCurriculumDao.findById(id);
    }

    public List<AdjustCurriculum> getByApplicant(int applicant) {
        return adjustCurriculumDao.findByApplicant(applicant);
    }

    public List<AdjustCurriculum> getByStatus(String status) {
        return adjustCurriculumDao.findByStatus(status);
    }

    public List<AdjustCurriculum> getAll() {
        return adjustCurriculumDao.findAll();
    }

    public void delete(AdjustCurriculum ac) {
        adjustCurriculumDao.delete(ac);
    }
}
