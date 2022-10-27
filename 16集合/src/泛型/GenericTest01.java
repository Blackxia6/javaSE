package 泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @date 2022/9/25 - 20:08
 * 不使用泛型
 */
public class GenericTest01 {
    public static void main(String[] args) {
        //不使用泛型机制，分析程序存在的缺点
        List myList = new ArrayList();
        //准备对象
        Cat c = new Cat();
        Bird b = new Bird();
        //将对象添加到集合
        myList.add(c);
        myList.add(b);

        //遍历集合，取出Cat让她抓老鼠,取出Bird，让她飞翔
        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object o = it.next();
            if (o instanceof Animal){//判断是否为Animal
                Animal animal = (Animal)o;
                animal.move();
            }
            if (o instanceof Cat){//判断是否为Cat类
                Cat cat = (Cat)o;//强转为Cat类
                cat.catchMouse();

            }else if (o instanceof Bird){//判断是否为Bird类
                Bird bird = (Bird)o;//强转为Bird类
                bird.fly();
            }

        }
    }
}
class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞翔");
    }
}

