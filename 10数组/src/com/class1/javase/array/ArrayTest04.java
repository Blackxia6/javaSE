package com.class1.javase.array;

import java.util.Scanner;

/**
 * @date 2022/9/9 - 13:48
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        System.out.println("JVM传递过来的数组参数,他这个数组的长度是："+args.length);
        System.out.println("JVM传递过来的数组参数："+args);
        String[] s = new String[0];
        System.out.println(s.length);
        System.out.println(s);

        System.out.println(args[1]);
    }
}
