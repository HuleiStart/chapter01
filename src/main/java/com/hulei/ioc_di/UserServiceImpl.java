package com.hulei.ioc_di;

/**
 * @author Mr.Hu
 * @create 2022/10/17 18:55
 */
public class UserServiceImpl implements UserService{
//    声明UserDao属性
    private UserDao userDao;
//    添加UserDao属性的setter（）方法注入，用于实现依赖注入

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
//    实现接口中的方法


    @Override
    public void login(){
//        调用userDao中的login（）方法，并执行输出语句
        this.userDao.login();
        System.out.println("userService login");
    }
}
