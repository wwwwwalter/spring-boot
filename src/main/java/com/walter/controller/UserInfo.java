package com.walter.controller;

import com.walter.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserInfo {
    @RequestMapping("/userinfo")
    public String userInfo(Model model){
        Student student = new Student();
        student.setId(1001);
        student.setName("Jack");
        student.setAge(22);
        student.setScore(100.0);
        model.addAttribute("student",student);
        model.addAttribute("hello","hello world");
        return "student";
    }
}
