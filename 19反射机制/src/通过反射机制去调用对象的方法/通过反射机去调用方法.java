package 通过反射机制去调用对象的方法;

import java.lang.reflect.Method;

/**
 * @date 2022/10/12 - 16:53
 */
public class 通过反射机去调用方法 {
    public static void main(String[] args) throws Exception{
        //使用反射机制调用方法
        Class userServiceClass = Class.forName("通过反射机制去调用对象的方法.service.UserService");
        //创建对象
        Object obj = userServiceClass.newInstance();
        //获取Method
        Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
        //调用方法
        Object returnValue = loginMethod.invoke(obj,"admin","123");
        System.out.println((boolean)returnValue?"登录成功" :"登录失败");


    }
}
