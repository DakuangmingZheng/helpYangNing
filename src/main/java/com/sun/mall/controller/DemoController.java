package com.sun.mall.controller;


import com.sun.mall.service.DemoService;
import com.sun.mall.utils.R;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


/**
 * @author sunql
 * @description controller层
 * @date 2020/12/29 15:30
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController {
    @Resource
    DemoService demoService;

    @GetMapping("/fetchUserInfo/{username}")
    @ResponseBody
    public R fetchUserInfo(@PathVariable String username)   {
        return ObjectUtils.isNotEmpty(demoService.fetchUserInfo(username))?R.ok(demoService.fetchUserInfo(username)):R.fail("fail to fetch userInfo");
    }
}