import java.util.Scanner;

interface Computer {//计算接口

    public abstract int sum(int a, int b);
}

/**
 * @date 2022/9/7 - 21:19
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aa = scanner.nextInt();
        int bb = scanner.nextInt();
        //调用MyMath里的mysum()方法
        MyMath mm = new MyMath();
        Computer c = new Computer() {//匿名内部类类
            @Override
            public int sum(int b, int a) {
                return a + b;
            }
        };
        mm.mysum(c, aa, bb);
        double a = 1.2356;
        String s = String.valueOf(a);
        System.out.println(s);
    }

    public void doSome() {
        class Inner3 {//局部内部类

        }
    }

    //该类在类的内部，所以称为内部类
    static class Inner1 {//静态内部类

    }

    class Inner2 {//实例内部类

    }

}

//class ComperIm implements Computer{
//    @Override
//    public int sum(int a, int b) {
//        return a+b;
//    }
//}
class MyMath {
    public void mysum(Computer c, int x, int y) {
        int value = c.sum(x, y);
        System.out.println(x + "+" + y + "=" + value);
    }
}