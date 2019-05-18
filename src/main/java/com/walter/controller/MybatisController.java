package com.walter.controller;

import com.walter.bean.Student;
import com.walter.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MybatisController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/mybatis")
    @ResponseBody
    public Object findAllStudent() {
        return studentService.selectAllStudent();
    }


    @RequestMapping("/insert")
    @ResponseBody
    public String insert(){
        Student student = new Student();
        student.setId(7);
        student.setName("hh");
        student.setAge(25);
        student.setScore(100.0);
        studentService.insert(student);
        return student.toString();
    }
}
