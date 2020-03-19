package com.hjx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author huangzhun
 * @Create 2020/3/19
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    @ResponseBody
    public String helloController(String str){
        str = "helloworld";
        return str;
    }
}
