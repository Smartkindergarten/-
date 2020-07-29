package com.kindergarten.webclient.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//应用名
@FeignClient(value = "parents",fallback = ParentDaoFeignFallBack.class)
public interface ParentDaoFeign {

    @RequestMapping(value = "pt/login")
    public String getLogin(@RequestParam("tel") String tel, @RequestParam("password") String password);
}
