package com.kindergarten.webclient.teacherDao;

public class TeacherDaoFeignFallBack implements TeacherDaoFeign
{

    @Override
    public String getTeacherinfo(String account, String pwd) {
        return "登录失败";
    }
}
