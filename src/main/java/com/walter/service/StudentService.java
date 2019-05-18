package com.walter.service;

import com.walter.bean.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAllStudent();
    void insert(Student student);
}
