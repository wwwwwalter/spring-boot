package com.walter.dao;

import com.walter.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> selectAllStudent();
    void insert(Student student);
}
