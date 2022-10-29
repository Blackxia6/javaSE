package 实现线程的两种方法;

import java.util.TreeSet;

/**
 * @date 2022/10/5 - 22:03
 * 采用匿名内部类的方式
 */
public class 匿名内部类的方式 {
    public static void main(String[] args) {
        //创建线程对象，采用匿名内部类的方式
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("分支线程--->"+i);
                }
            }
        });
        //启动线程
        t.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("主线程--->"+i);
        }
        A a = new A() {
            @Override
            public void sum() {

            }
        };
        B b = new B();
        Thread thread = new Thread(b);
        thread.start();
    }
}

interface A{
    public abstract void sum();
}

class B implements Runnable{

    @Override
    public void run() {
        System.out.println(11);
    }
}