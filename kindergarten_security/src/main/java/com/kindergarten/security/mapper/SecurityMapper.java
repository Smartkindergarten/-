package com.kindergarten.security.mapper;

import com.kindergarten.security.bean.Security;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SecurityMapper {

    Security login(Security security);

}
