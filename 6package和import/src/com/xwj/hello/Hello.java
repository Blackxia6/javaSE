package com.xwj.hello;
import com.Hello1;
import java.util.Scanner;
/**
 * @date 2022/9/5 - 15:24
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("xwj的包");
        Hello1 h2  = new Hello1();
        System.out.println(h2);
        Scanner s = new Scanner(System.in);
        System.out.print("输入一个数字：");
        int a = s.nextInt();
        System.out.print("输入字符串：");
        String b = s.next();
        System.out.println(a);
        System.out.println(N.sum(1,2));


    }
}
class N{
    public static int sum(int a,int b){
        System.out.println("111");
        return a+b;
    }
}