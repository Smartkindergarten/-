package com.kindergarten.teacher.service.imp;

import com.kindergarten.teacher.mapper.TeacherMapper;
import com.kindergarten.teacher.model.TblTeachers;
import com.kindergarten.teacher.service.TeacherService;

public class TeacherServiceimp implements TeacherService {

    private TeacherMapper teacherMapper;

    @Override
    public TblTeachers teachersLogin(TblTeachers tblTeachers) {

        TblTeachers tblTeachers1;
        tblTeachers1=teacherMapper.login(tblTeachers);

        return tblTeachers1;
    }
}
