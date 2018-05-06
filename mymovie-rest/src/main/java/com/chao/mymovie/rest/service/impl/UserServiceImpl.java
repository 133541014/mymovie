package com.chao.mymovie.rest.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chao.mymovie.rest.mapper.UserMapper;
import com.chao.mymovie.rest.model.User;
import com.chao.mymovie.rest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author:WangYichao
 * @Description:
 * @Date:Created in 2018/5/5 22:25
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
