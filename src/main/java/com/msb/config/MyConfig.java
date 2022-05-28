package com.msb.config;

import com.msb.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    /*<bean id="" name="" class="com.msb.pojo.User"></bean>*/
    @Bean  //向容器中声明一个组件  User对象，方法名默认bean的id，返回值类型就是bean的class
    public User user01(){
        return new User(1,"zhangsan","123456");
    }

}
