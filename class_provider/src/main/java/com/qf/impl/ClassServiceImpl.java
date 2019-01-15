package com.qf.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.dao.IClassDao;
import com.qf.entity.Class_;
import com.qf.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClassServiceImpl implements IClassService {

    @Autowired
    private IClassDao classDao;



    @Override
    public List<Class_> queryAllClass() {
        return classDao.selectList(new QueryWrapper<>());
    }

    @Override
    public String getClassNameById(int id) {
        System.out.println("classImpl-接收到的id>>>"+id);
        QueryWrapper<Class_> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        Class_ class_ = classDao.selectOne(queryWrapper);
        System.out.println("查询到的班级名称"+class_.getClassName());
        return class_.getClassName();
    }
}
