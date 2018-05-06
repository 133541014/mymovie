package com.chao.mymovie.portal.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.chao.mymovie.portal.service.ITestService;
import com.chao.mymovie.rest.model.User;
import com.chao.mymovie.rest.service.IUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author:WangYichao
 * @Description:
 * @Date:Created in 2018/5/6 11:35
 */
@Component
public class TestServiceImpl implements ITestService {

    @Reference(version = "1.0.0")
    private IUserService userService;

    @Override
    public User getUserById(String id) {
        return userService.getUser(id);
    }
}
