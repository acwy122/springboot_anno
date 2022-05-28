package com.msb;

import com.msb.config.MyConfig;
import com.msb.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.msb")
public class SpringbootAnnoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootAnnoApplication.class, args);
        //从容器中取出bean，获取容器中的bean
//        User user01 = context.getBean("user01", User.class);
//        User user02 = context.getBean("user2", User.class);
//        System.out.println(user01);
//        System.out.println(user02);
//        System.out.println(user01==user02);
        //容器都初始化了哪些对象
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String name:beanDefinitionNames) {
//            System.out.println(name);
//        }

        //获取MyConfig对象，单例模式
//        MyConfig myConfig1 = context.getBean(MyConfig.class);
//        MyConfig myConfig2 = context.getBean(MyConfig.class);
//        System.out.println(myConfig1 == myConfig2);
//
//        //new的方法获得的是两个内存对象
//        MyConfig myConfig3 = new MyConfig();
//        //容器获取的myConfig1，是从注解中获取的bean，代理bean方法，获取到的myConfig1，是一个代理bean对象
//        User user1 = myConfig1.getUser();
//        User user2 = myConfig1.getUser();
//        System.out.println(user1 == user2);
//        System.out.println(myConfig1 == myConfig3);


        //@Import()注解,可以放到被扫描到的类上即可
//        User user = context.getBean("com.msb.pojo.User",User.class);
//        System.out.println(user);
//
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String name:beanDefinitionNames) {
//            System.out.println(name);
//        }


//        @Conditional()条件装配




    }

}
