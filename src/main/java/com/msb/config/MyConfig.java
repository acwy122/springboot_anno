package com.msb.config;

import com.msb.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = true)
/**
 * proxyBeanMethods = false  like模式  启动快
 *
 * proxyBeanMethods = true  full模式  通过代理对象，依赖spring容器控制bean单例
 */
public class MyConfig {

    /*<bean id="" name="" class="com.msb.pojo.User"></bean>*/
    @Bean  //向容器中声明一个组件  User对象，方法名默认bean的id，返回值类型就是bean的class
    public User user01(){
        return new User(1,"zhangsan","123456");
    }

    @Bean("user02")
    public User getUser(){
        return new User(2,"lisi","123456");
    }

}
