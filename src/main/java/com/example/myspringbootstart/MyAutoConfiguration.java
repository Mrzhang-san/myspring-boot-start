package com.example.myspringbootstart;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 重点：实现自动配置化功能
 *@Configuration 标注该类是配置类
 * @ConditionalOnClass(MyService.class) 条件注解 只有在classpath下存在制定class文件时才会实例化bean
 * @EnableConfigurationProperties(MyServiceProperties.class) 使制定配置类生效
 * @Bean 创建一个实力类注入到spring ioc容器中
 * @ConditionalOnMissingBean 条件注解，仅当ioc容器不存在指定类型的bean时才会创建bean
 *
 */
@Configuration
@ConditionalOnClass(MyService.class)
@EnableConfigurationProperties(MyServiceProperties.class)
public class MyAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MyService myService(){
        return  new MyServiceImpl();
    }

}
