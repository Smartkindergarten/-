package com.kindergarten.security.controller;


import com.kindergarten.security.bean.Security;
import com.kindergarten.security.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/securityController")
public class SecurityController {

    @Autowired
    private SecurityService securityService;


    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=utf-8");
        Security security=new Security();

        System.out.println("SecurityController login ing...");

        security.setPhone(Integer.parseInt(request.getParameter("phone")));
        security.setSecurityPwd(request.getParameter("pwd"));
        System.out.println("security="+security);

        return securityService.login(security) != null ? "success" : "error";
    }

}
