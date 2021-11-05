package com.example.myspringbootstart;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置类
 * @ConfigurationProperties 注解能获取到 配置文件中 前缀为spring.my节点下的message属性
 */
@ConfigurationProperties(prefix = "spring.my")
public class MyServiceProperties {

    /**
     * 默认输出
     */
    private String message ="hello world!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
