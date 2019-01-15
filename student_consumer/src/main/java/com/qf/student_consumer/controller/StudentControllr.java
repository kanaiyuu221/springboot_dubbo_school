package com.qf.student_consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Class_;
import com.qf.entity.Student;
import com.qf.service.IClassService;
import com.qf.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentControllr {

    @Reference
    private IStudentService studentService;

    @Reference
    private IClassService classService;

    @RequestMapping("/query/{id}")
    public Student selectOne(@PathVariable("id")int id){
        Student student=studentService.getStudentById(id);
        return student;
    }

    @RequestMapping("/queryall")
    public List<Student> queryAll(){
        List<Student> list=studentService.queryAllStudent();
        return list;
    }

    @RequestMapping("/insertStu")
    public String insertStu(Model model){
        List<Class_> list=classService.queryAllClass();
        System.out.println(list);
        model.addAttribute("clist",list);
        return "addstuPage";
    }
}
