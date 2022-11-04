/**
 * @date 2022/9/2 - 21:16
 */
public class finalTest01 {
    public static void main(String[] args) {
        //final修饰的变量只能赋一次值
       final int i = 100;
        //i=200;
    }
}
//final可以不让其他类继承该类

final class A{

}
/*
*class B extends A{
*
*}
*/
//final修饰的方法无法被覆盖
class C{
    public final void doSome(){
        System.out.println("C‘s doSome");
    }
}
class D extends C{
//    public void doSome(){
//        System.out.println("D's doSome");
//    }
}
