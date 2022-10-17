package com.hulei.ioc_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.Hu
 * @create 2022/10/17 18:43
 */
public class IoC {
    public static void main(String[] args) {
//        1.初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        2.通过容器获取userDao实例
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
//        3.调用实例中的login()方法
        userDao.login();
    }
}
