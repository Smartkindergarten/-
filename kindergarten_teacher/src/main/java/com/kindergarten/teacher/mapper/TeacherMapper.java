package com.kindergarten.teacher.mapper;

import com.kindergarten.teacher.model.TblTeachers;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper
{

   public TblTeachers tologin(String tel);
   public String FindRole(int teacherid);

}
