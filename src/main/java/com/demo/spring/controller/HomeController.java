package com.demo.spring.controller;


import com.demo.spring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private Student student;
    @GetMapping(value = "/")
    public ModelAndView home()
    {
        ModelAndView model = new ModelAndView();
        student.setName("Nguyễn Đình Nguyên");
        student.setAge(26);
        model.addObject("student", student);
        model.setViewName("home");
        return model;
    }
}
