package com.kindergarten.webclient.dao;

import org.springframework.stereotype.Component;

@Component
public class TeacherDaoFeignFallBack implements TeacherDaoFeign {

    @Override
    public String getTeacherLogin(String tel, String password) {
        return "登陆失败 FallBack";
    }
}
