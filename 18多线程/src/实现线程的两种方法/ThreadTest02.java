package 实现线程的两种方法;

/**
 * @date 2022/10/5 - 21:53
 *实现线程的第二种方法
 *     编写一个类，实现java.lang.Runnable接口，实现run方法
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //创建一个可运行的对象
        MyRunnable myRunnable = new MyRunnable();
        //将可运行的对象封装成一个线程对象
        Thread thread = new Thread(myRunnable);
        //启动线程,创建一个分支线程（分支栈）
        thread.start();

        for (int i = 0; i <100 ; i++) {
            System.out.println("主线程--->"+i);
        }

    }
}

class MyRunnable implements Runnable{//这不是一个线程类，是一个可运行的类

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("分支线程--->"+i);
        }
    }
}