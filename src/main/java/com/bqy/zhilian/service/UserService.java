package com.bqy.zhilian.service;

import com.bqy.zhilian.entity.request.user.UserRegisterRequest;

/**
 * 用户 服务层。
 *
 * @author bianqingyun
 */
public interface UserService {

    boolean register(UserRegisterRequest request);
}
