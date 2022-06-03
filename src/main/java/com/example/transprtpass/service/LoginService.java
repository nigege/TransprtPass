package com.example.transprtpass.service;
import com.example.transprtpass.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    LoginDao loginDao;
    public String login(String postJson){
        /*String name=postJson.substring(0, postJson.indexOf(";"));                    //首先取出包括name：的name
        String password=postJson.substring(name.length()+1, postJson.length());        //取出包括password：的password
        name=name.substring(4,name.length());                                          //取出后半段
        password=password.substring(8,password.length());                              //取出后半段*/
        String name=postJson.substring(5,8);
        String password=postJson.substring(13,15);
        name="123";
        loginDao.check(name);                                                          //数据传递
        return "登陆成功";
    }
}
