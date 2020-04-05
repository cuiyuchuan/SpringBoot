package com.cych.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    /*
        通过@Value注解将配置文件中的值映射到一个Spring管理的Bean的字段上
     */
    @Value("${name}")
    private String name;
    @Value("${person.age}")
    private Integer age;

    @RequestMapping("/hello.do")
    @ResponseBody
    public String helloSpringBoot(){
        return "SpringBoot name:"+name+",age:"+age;
    }
}
