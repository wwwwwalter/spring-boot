package com.walter.controller;

import com.walter.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SelectAllUsers {
    @RequestMapping("allusers")
    public String selectAllUsers(Model model){
        List<Student> studentList = new ArrayList<>();
        for(int i = 0;i<10;++i){
            Student student = new Student();
            student.setId(i);;
            student.setName("Jack"+i);
            student.setAge(20+i);
            studentList.add(student);
        }
        model.addAttribute("studentList",studentList);
        return "user";
    }
}
