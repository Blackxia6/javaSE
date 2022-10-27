package 泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @date 2022/9/25 - 20:26
 */
public class 使用泛型 {
    public static void main(String[] args) {
        //使用泛型机制 List<Animal1> 表示List集合中只允许存储Animal类型的数据
        List<Animal1> myList1 = new ArrayList<Animal1>();
        //准备对象
        Cat1 cat1 = new Cat1();
        Bird1 bird1 = new Bird1();
        //将对象添加到集合
        //myList1.add("s");//使用了泛型之后只能存储泛型类
        myList1.add(cat1);
        myList1.add(bird1);
        //获取迭代器
        //使用泛型
        Iterator<Animal1> it2 = myList1.iterator();
        while (it2.hasNext()){
           Animal1 animal1 =  it2.next();
           animal1.move();
            if (animal1 instanceof Cat1){
                Cat1 cat11 = (Cat1)animal1;
                cat11.catchMouse();
            }
        }

    }





    }

class Animal1{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat1 extends Animal1{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Bird1 extends Animal1{
    public void fly(){
        System.out.println("鸟儿在飞翔");
    }
}

