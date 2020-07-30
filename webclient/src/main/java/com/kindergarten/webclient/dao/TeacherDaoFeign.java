package com.kindergarten.webclient.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "teacher")
public interface TeacherDaoFeign
{

    @RequestMapping(value = "tc/login")
    public String getTeacherLogin(@RequestParam("tel")String tel,
                                 @RequestParam("password")String password);

}
