package com.chao.mymovie.portal.controller;

import com.chao.mymovie.portal.service.ITestService;
import com.chao.mymovie.rest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:WangYichao
 * @Description:
 * @Date:Created in 2018/5/6 12:56
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping("/testUser/{userId}")
    @ResponseBody
    public User getUser(@PathVariable("userId")String userId){
        return testService.getUserById(userId);
    }
}
