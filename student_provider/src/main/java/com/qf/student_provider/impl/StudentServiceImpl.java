package com.qf.student_provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.entity.Class_;
import com.qf.entity.Student;
import com.qf.service.IStudentService;
import com.qf.student_provider.dao.IStudentDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao studentDao;

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

    @Override
    public List<Student> queryAllStudent() {
        return studentDao.queryAllStudent();
    }

    @Override
    public List<Class_> queryAllClass() {
        return null;
    }
}
