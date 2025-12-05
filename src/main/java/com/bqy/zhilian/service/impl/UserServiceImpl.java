package com.bqy.zhilian.service.impl;

import com.bqy.zhilian.dao.UserDao;
import com.bqy.zhilian.entity.request.user.UserRegisterRequest;
import com.bqy.zhilian.service.UserService;
import com.bqy.zhilian.util.ThrowUtils;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 用户 服务层实现。
 *
 * @author bianqingyun
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public boolean register(UserRegisterRequest request) {
        ThrowUtils.throwIf(StringUtils.isAnyBlank(request.getUserAccount(), request.getUserName(), request.getUserPassword(), request.getCheckPassword()), "注册信息不全");
        return userDao.register(request.getUserName(), request.getUserAccount(), request.getUserPassword(), request.getCheckPassword());
    }
}
