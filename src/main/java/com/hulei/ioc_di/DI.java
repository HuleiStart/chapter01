package com.hulei.ioc_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.Hu
 * @create 2022/10/17 19:47
 */
public class DI {
    public static void main(String[] args) {
//        1.初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        2.通过容器获取userService实例
        UserService userService = (UserService) applicationContext.getBean("userService");
//        3.调用实例中的login（）方法
        userService.login();
    }
}
