package com.chao.mymovie.rest.service;

import com.chao.mymovie.rest.model.User;

/**
 * @author:WangYichao
 * @Description:用户接口
 * @Date:Created in 2018/5/5 22:21
 */
public interface IUserService {

    User getUser(String userId);
}
