/**
 * @date 2022/9/5 - 8:51
 */
public class extendsimplements {
    public static void main(String[] args) {
        Flyable fly = new Cat();
        fly.fly();
    }
}
class Animal{

}
//可飞翔的接口
interface Flyable{
    public abstract void fly();
}
class Cat extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("Cat长了一对翅膀");
    }
}
class snack extends Animal{

}
 abstract class A1{
 public abstract void doSome();//抽象方法
     public void doOther(){
         System.out.println("我不是抽象方法");
     }

}