package com.kindergarten.webclient.controller;

import com.kindergarten.webclient.dao.TeacherDaoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/teacherController")
@Controller
public class teacherController
{
    @Autowired
    private TeacherDaoFeign teacherDaoFeign;
    @RequestMapping(value = "/Login")
    @ResponseBody
    public String Login(String tel,String password)
    {
        System.out.println("webclinet进来了");
        return teacherDaoFeign.getTeacherLogin(tel, password);
    }
}
