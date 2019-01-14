package com.qf.student_provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.entity.Student;
import com.qf.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
    @Override
    public Student getStudentById(int id) {
        System.out.println("studentProviderImpl>>>id="+id);
        Student student=new Student();
        student.setId(id);
        student.setName("hdigsdg");
        student.setAge(245);
        student.setClass_id(456);
        return student;
    }
}
