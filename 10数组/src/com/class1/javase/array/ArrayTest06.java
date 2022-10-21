package com.class1.javase.array;

/**
 * @date 2022/9/9 - 14:12
 */
//一维数组的深入，数组中存储引用数据类型
public class ArrayTest06 {
    public static void main(String[] args) {
        //创建一个Animal数组
        Animal a1 = new Animal();
        Dog dog1 = new Dog();
        Animal[] animals = {a1,dog1};
        for (int i = 0; i <animals.length ; i++) {
            Animal a = animals[i];
            if (a instanceof Dog){
                Dog dog = (Dog)a;
                dog.eat();

            }else {
                a.move();
            }
        }
    }
}
class Animal{
    public void move(){
        System.out.println("Animal move.....");
    }
}
class Dog extends Animal{
    public void move(){
        System.out.println("Dog move.....");
    }
    public void eat(){
        System.out.println("Dog like eat grout");
    }
}