package com.bqy.zhilian.controller;

import com.bqy.zhilian.common.ApiResponse;
import com.bqy.zhilian.entity.request.user.UserRegisterRequest;
import com.bqy.zhilian.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户 控制层。
 *
 * @author bianqingyun
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 保存用户。
     *
     * @param request 注册请求
     * @return {@code true} 保存成功，{@code false} 保存失败
     */
    @PostMapping("register")
    public ApiResponse<Boolean> save(@RequestBody UserRegisterRequest request) {
        return ApiResponse.success(userService.register(request));
    }

}
