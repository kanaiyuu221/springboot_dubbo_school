package com.qf.student_provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf.student_provider")
@DubboComponentScan("com.qf.student_provider.impl")
@MapperScan("com.qf.student_provider.dao")
public class StudentProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentProviderApplication.class, args);
    }

}

