package com.sun.mall.service.impl;

import com.sun.mall.entity.User;
import com.sun.mall.mapper.DemoMapper;
import com.sun.mall.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DemoServiceImpl implements DemoService {
    @Resource
    DemoMapper demoMapper;
    @Override
    public User fetchUserInfo(String username) {
        return demoMapper.fetchUserInfo(username);
    }
}
