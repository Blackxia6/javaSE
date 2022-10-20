package com.class1.javase.array;

/**
 * @date 2022/9/8 - 11:30
 */
public class ArrayTest01 extends Object{
    public static void main(String[] args) {
        //声明一个int类型 的数组，使用静态初始化的方式
        int[] a1 = {10,5,11,3,6,2};
        System.out.println("数组元素个数:"+a1.length);
        //修改元素
        a1[0]  = 111;
        System.out.println(a1[0]);
        int[] a2 = new int[3];
        for (int i = 0;i<a1.length;i++){
            System.out.println(a1[i]);
        }
        System.out.println("===========================");
        for (int i = a1.length-1;i>=0;i--){
            System.out.print("颠倒输出:"+a1[i]);
        }
    }

}
