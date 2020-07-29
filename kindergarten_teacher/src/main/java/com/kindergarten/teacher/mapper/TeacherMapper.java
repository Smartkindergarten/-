package com.kindergarten.teacher.mapper;

import com.kindergarten.teacher.model.TblTeachers;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper
{

    TblTeachers login(TblTeachers tblTeachers);

}
