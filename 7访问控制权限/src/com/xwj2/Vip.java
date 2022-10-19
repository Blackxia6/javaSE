package com.xwj2;

import Hello.User;

/**
 * @date 2022/9/6 - 15:24
 */
public class Vip extends User {
    public void shopping(){
        System.out.println(this.age);//子类中可以访问protected修饰的属性
        System.out.println(this.weight);
    }
}
