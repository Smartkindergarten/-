package com.kindergarten.webclient.controller;

import com.kindergarten.webclient.dao.ParentDaoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/parentController")
@Controller
public class parentController {
    //尝试更新看看

    @Autowired
    private ParentDaoFeign parentDaoFeign;

    @RequestMapping(value = "/Login")
    @ResponseBody
    public String Login(String tel,String password){
        System.out.println("webclinet进来了");

//    userService.getUserinfo(account);

//    return userService.getUserinfo(account,password);
        return parentDaoFeign.getLogin(tel, password);
    }

}


