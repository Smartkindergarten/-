package com.kindergarten.teacher.controller;

import com.kindergarten.teacher.model.TblTeachers;
import com.kindergarten.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RequestMapping("/teacherController")
@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/teachersLogin")
    @ResponseBody
    public String teachersLogin(HttpServletRequest request, HttpServletResponse response, TblTeachers tblTeachers) throws IOException
    {
        TblTeachers tblTeachers1=teacherService.teachersLogin(tblTeachers);
        String res = "";
        if (tblTeachers1!=null)
        {
            System.out.println("成功");
            HttpSession session = request.getSession();
            session.setAttribute("tblTeachers1",tblTeachers1);
            res = "1";
        }else{
            System.out.println("账号或密码错误");
            res = "0";
        }
        return res;
    }

}
