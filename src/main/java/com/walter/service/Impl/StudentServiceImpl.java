package com.walter.service.Impl;

import com.walter.bean.Student;
import com.walter.dao.StudentMapper;
import com.walter.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }
}
