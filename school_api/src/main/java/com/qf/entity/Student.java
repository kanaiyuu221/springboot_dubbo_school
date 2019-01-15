package com.qf.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    //@TableId( = IdType.AUTO)
    private int id;
    private String name;
    private int age;
    private int classId;

    //@TableField(exist = false)
    private String className;
}
