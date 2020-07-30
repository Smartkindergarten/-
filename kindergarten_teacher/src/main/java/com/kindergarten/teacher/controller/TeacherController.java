package com.kindergarten.teacher.controller;

import com.kindergarten.teacher.mapper.TeacherMapper;
import com.kindergarten.teacher.model.TblTeachers;
import com.kindergarten.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RequestMapping("/tc")
@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
    @Autowired
    private TeacherMapper teacherMapper;

    @RequestMapping("/login")
    @ResponseBody
    public String teachersLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tel = request.getParameter("tel");
        System.out.println("tel:"+tel);
        String password = request.getParameter("password");
        System.out.println("password:"+password);
        TblTeachers tblTeachers = teacherService.login(tel);
        System.out.println("tblTeachers.....:"+tblTeachers);
        String res = "";
        if (tblTeachers != null) {

//            String roleName = teacherMapper.FindRole(tblTeachers.getTeacherId());
//            tblTeachers.setTeacherName(roleName);
            System.out.println("成功......");

            if (password.equals(tblTeachers.getTeacherPwd())) {

                HttpSession session = request.getSession();
                session.setAttribute("tblTeachers", tblTeachers);
                System.out.println("1111111:");
                res = "1";

                return res;

            }else{
                System.out.println("密码错误！");
                res = "0";
                return res;
            }
        } else {
            System.out.println("账号错误");
            res = "0";
            return res;
        }

    }
}
