package com.cych.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "mYS";
    }

    @RequestMapping("/hello.do")
    @ResponseBody
    public String helloSpringBoot(){
        return "SpringBoot!!";
    }
}
