package com.qf.service;

import com.qf.entity.Class_;
import com.qf.entity.Student;

import java.util.List;

public interface IStudentService {
    Student getStudentById(int id);
    List<Student> queryAllStudent();
    List<Class_> queryAllClass();
}
