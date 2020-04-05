package com.cych.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "person")
public class ControllerConﬁguration {

    /*
    通过注解@ConﬁgurationProperties(preﬁx="配置文件中的key的前缀")
    可以将配置文件中的配置自动与实体进行映射
     */

    private String name;
    private Integer age;

    @RequestMapping("/config.do")
    @ResponseBody
    public String helloSpringBoot(){
        return "Hello~  SpringBoot name:"+name+",age:"+age;
    }
    /*
    使用@ConﬁgurationProperties方式可以进行配置文件与实体字段的自动映射，
    但需要字段必须提供set方法才可以
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
