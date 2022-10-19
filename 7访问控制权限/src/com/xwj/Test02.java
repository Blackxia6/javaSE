package com.xwj;
import Hello.User;

/**
 * @date 2022/9/6 - 15:12
 */
public class Test02 {
    public static void main(String[] args) {
        User user = new User();
        //System.out.println(user.id);//私有的不能访问
        //System.out.println(user.age);//protected
        System.out.println(user.weight);//public
        //System.out.println(user.name);
    }
}
