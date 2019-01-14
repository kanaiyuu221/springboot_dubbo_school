package com.qf.student_provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("com.qf.student_provider.impl")
public class StudentProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentProviderApplication.class, args);
    }

}

