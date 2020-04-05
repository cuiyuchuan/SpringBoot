package com.cych;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//声明当前类为SpringBoot引导类
@SpringBootApplication
public class MySpringBootApplication {
    //SpringBoot程序的入口
    public static void main(String[] args) {
        //参数为 引导类的字节码文件
        SpringApplication.run(MySpringBootApplication.class);
    }
}
