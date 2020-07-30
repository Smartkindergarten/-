package com.kindergarten.webclient.teacherDao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "teacher",fallback = TeacherDaoFeignFallBack.class)
public interface TeacherDaoFeign
{

    @RequestMapping(value = "teacherController/teachersLogin")
    public String getTeacherinfo(@RequestParam("teacherTel")String account,
                                 @RequestParam("teacherPwd")String pwd);

}