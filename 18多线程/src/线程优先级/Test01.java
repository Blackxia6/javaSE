package 线程优先级;

/**
 * @date 2022/10/6 - 21:36
 * 关于线程的优先级
 */
public class Test01 {
    public static void main(String[] args) {
        //设置主线程的优先级
        Thread.currentThread().setPriority(1);
        System.out.println("最高优先级"+Thread.MAX_PRIORITY);
        System.out.println("默认优先级"+Thread.NORM_PRIORITY);
        System.out.println("最低优先级"+Thread.MIN_PRIORITY);
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"线程的优先级--->"+t.getPriority());

        MyRunnable myRunnable = new MyRunnable();

        Thread t1 = new Thread(myRunnable);
        t1.setPriority(10);
        t1.start();
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"线程的优先级--->"+t.getPriority());
    }
}