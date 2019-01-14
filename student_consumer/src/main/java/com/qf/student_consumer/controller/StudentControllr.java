package com.qf.student_consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Student;
import com.qf.service.IStudentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stu")
public class StudentControllr {

    @Reference
    private IStudentService studentService;

    @RequestMapping("/query/{id}")
    public Student selectOne(@PathVariable("id")int id){
        Student student=studentService.getStudentById(id);
        return student;
    }
}