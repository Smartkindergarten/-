package com.kindergarten.parent.mapper;

import com.kindergarten.parent.bean.Parents;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ParentsMapper {

    public Parents login(String tel);
    public String FindRole(int roleid);

}
