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
}
