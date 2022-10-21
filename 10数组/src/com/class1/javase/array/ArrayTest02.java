package com.class1.javase.array;

/**
 * @date 2022/9/8 - 21:12
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        //动态初始化数组
        int[] array1 = new int[3];
        //遍历数组
        for (int i = 0;i<array1.length;i++){
            System.out.println("数组中下标为"+i+"的元素:"+array1[i]);
        }
        Object[] object = new Object[3];
        for (int i = 0;i<object.length;i++){
            System.out.println(object[i]);
        }
        System.out.println("=======================");
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        ArrayTest02 arrayTest02 = new ArrayTest02();
        Object[] obj ={o1,o2,o3,arrayTest02};
        for (int i = 0; i <obj.length ; i++) {
            System.out.println(obj[i]);
        }
    }

}
