package com.class1.javase.array;

/**
 * @date 2022/9/9 - 13:26
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        int[] x = {1 ,5 ,8 ,4 ,6 ,2};
        ArrayTest03.printArray(x);
        System.out.println("=======================");
        String[] arg = {"hello ","world ","I'am ","coming"};
        ArrayTest03.printArray(arg);
        System.out.println("=======================");
        ArrayTest03.printArray(new int[]{1,2,3});//直接传递静态数组
        System.out.println("=======================");
        ArrayTest03.printArray(new int[3]);
    }
    public static void printArray(int[] array){//方法重载
        for (int i = 0; i <array.length ; i++) {
            System.out.println("int类型数组的元素第"+(i+1)+"个元素:"+array[i]);
        }
    }
    public static void printArray(String[] args){//方法重载
        for (int i = 0; i <args.length ; i++) {
            System.out.print(args[i]);
        }
        System.out.println();
    }
}
