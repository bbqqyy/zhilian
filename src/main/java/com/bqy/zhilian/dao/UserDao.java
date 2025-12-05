package com.bqy.zhilian.dao;

import com.bqy.zhilian.entity.model.User;
import com.bqy.zhilian.mapper.UserMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class UserDao extends ServiceImpl<UserMapper, User> {

    public boolean register(String userName, String userAccount, String userPassword, String checkPassword) {
        User user = new User();
        user.setUserAccount(userAccount);
        user.setUserPassword(userPassword);
        user.setUserName(userName);
        return this.save(user);
    }
}
