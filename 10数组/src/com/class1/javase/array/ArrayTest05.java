package com.class1.javase.array;

/**
 * @date 2022/9/9 - 13:59
 */
//模拟一个系统，假设这个系统要使用，必须输入用户名和密码。
public class ArrayTest05 {
    //用户名和密码输入到String[] args数组中
    public static void main(String[] args) {
        if (args.length!=2){
            System.out.println("使用给系统未输入程序参数，参数包括用户名和密码信息例如：zhangsan 123");
            return;
        }
        String username = args[0];
        String password = args[1];
        if ("zhangsan".equals(username) && "123".equals(password)){
            System.out.println("登录成功 欢迎"+username);
        }else {
            System.out.println("登陆失败，用户名或密码错误");
        }
    }
}
