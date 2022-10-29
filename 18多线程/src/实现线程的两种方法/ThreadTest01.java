package 实现线程的两种方法;

/**
 * @date 2022/10/5 - 21:05
 * 实现线程的第一种方式
 *    写一个类，直接继承java.lang.Thread 重写run方法
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        //这里是main方法，这里是主线程，在主栈中运行
        //新建一个分支线程
        MyTherad myTherad = new MyTherad();
        //启动线程
        //这段代码的任务只是为了开辟一个新的栈空间，启动成功的分支线程会自动调用run方法，并且在分支栈的底部
        myTherad.start();//start()方法作用：启动一个分支线程，在JVM中开辟一个新的栈空间，，这段代码任务完成之后这段代码瞬间就结束了

        //这里的代码还是运行在主线程中
        for (int i = 0; i <1000 ; i++) {
            System.out.println("主线程---->"+i);
        }
    }
}

class MyTherad extends Thread{
    @Override
    public void run() {
        //编写程序，这段程序运行在分支线程中（分支栈）
        for (int i = 0; i <1000 ; i++) {
            System.out.println("分支线程---->"+i);
        }

    }
}