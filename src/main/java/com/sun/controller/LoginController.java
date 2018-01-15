package com.sun.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunjian.
 */
@RestController
@RequestMapping("/public")
public class LoginController
{
    @PostMapping("/login")
    public void login(String code, String password)
    {
        // todo 添加登录逻辑
    }
}
