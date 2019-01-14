package com.qf.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private int class_id;
}
