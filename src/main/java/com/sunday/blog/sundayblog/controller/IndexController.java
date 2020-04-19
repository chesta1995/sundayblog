package com.sunday.blog.sundayblog.controller;

import com.sunday.blog.sundayblog.pojo.User;
import com.sunday.blog.sundayblog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private TestService testService;

    @RequestMapping("/index")
    public String index(){
        List<User> user = testService.getUser();
        System.out.println(user);
        return "index";
    }
}
