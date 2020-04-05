package com.cych.mapper;

import com.cych.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {

    public List<Student> findAll();
}
