package com.kindergarten.webclient.dao;

import org.springframework.stereotype.Component;

@Component
public class ParentDaoFeignFallBack implements ParentDaoFeign {


    @Override
    public String getLogin(String tel, String password) {
        return "登陆失败 FallBack";
    }
}
