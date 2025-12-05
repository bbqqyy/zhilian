package com.bqy.zhilian.entity.request.user;

import lombok.Data;

@Data
public class UserRegisterRequest {
    private String userName;
    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
