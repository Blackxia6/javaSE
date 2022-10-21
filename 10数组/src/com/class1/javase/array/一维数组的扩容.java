package com.class1.javase.array;

/**
 * @date 2022/9/9 - 14:47
 */
public class 一维数组的扩容 {
    public static void main(String[] args) {
//        System.arraycopy();
        int[] a = {11,2,3,45,8};//拷贝源（被拷贝）
        int[] a2 = new int[20];//拷贝目标（拷进的目的地）

        System.arraycopy(a,2,a2,4,2);// 拷贝源,拷贝起始位置,目标源,目标起始位置,拷贝长度
        for (int i = 0; i <a2.length ; i++) {
            System.out.println(a2[i]);
        }
        System.out.println("===============================");
        String[] str = {"hello","world","nihao"};
        String[] newstr  = new String[10];
        System.arraycopy(str,0,newstr,0,str.length);
        for (int i = 0; i < newstr.length ; i++) {
            System.out.println(newstr[i]);
        }
    }
}
