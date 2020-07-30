package com.kindergarten.security.service.impl;

import com.kindergarten.security.bean.Security;
import com.kindergarten.security.mapper.SecurityMapper;
import com.kindergarten.security.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("securityServiceImpl")
public class SecurityServiceImpl implements SecurityService {

    @Autowired
    private SecurityMapper securityMapper;

    @Override
    public Security login(Security security) {
        return securityMapper.login(security);
    }

}
