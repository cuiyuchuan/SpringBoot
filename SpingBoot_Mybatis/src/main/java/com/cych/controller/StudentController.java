package com.cych.controller;

import com.cych.mapper.StudentMapper;
import com.cych.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Student> findAll() {
        List<Student> students = studentMapper.findAll();
        return students;
    }
}
