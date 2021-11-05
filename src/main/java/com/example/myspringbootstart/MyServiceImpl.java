package com.example.myspringbootstart;

import org.springframework.beans.factory.annotation.Autowired;

public class MyServiceImpl implements MyService {

    @Autowired
    private MyServiceProperties myServiceProperties;

    /**
     * 获取配置类的内容打印
     */
    @Override
    public void sayHi() {
        System.out.println(myServiceProperties.getMessage());

    }
}
