package com.kindergarten.teacher.service.imp;

import com.kindergarten.teacher.mapper.TeacherMapper;
import com.kindergarten.teacher.model.TblTeachers;
import com.kindergarten.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceimp implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public TblTeachers login(String tel)
    {
        TblTeachers tblTeachers = null;
        tblTeachers = teacherMapper.tologin(tel);
        return tblTeachers;
    }
}
