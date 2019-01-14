package com.qf.student_provider.dao;

import com.qf.entity.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> queryAllStudent();
}
