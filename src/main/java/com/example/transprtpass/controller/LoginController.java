package com.example.transprtpass.controller;

import com.example.transprtpass.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                                          //这种注解的形式可以方便的添加引用，这里主要为了声明这是一个control层
public class LoginController {
    @Autowired                                           //为了将数据传输到service里加的注解
    LoginService loginService;                           //导入了对应的服务层，并且实例化
    @RequestMapping("login")                          //login就是我的接口的名字，这里用作登录
    public String login(@RequestBody String postJson){  //定义一个login的函数用于传递登录名和密码，是从前端传递进来的
        loginService.login(postJson);                   //这就是将前端获取的数据传递给service
        return "登录成功";                               //先用作占位
    }
}

