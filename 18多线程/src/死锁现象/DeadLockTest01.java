package 死锁现象;

/**
 * @date 2022/10/7 - 22:11
 * 死锁代码要会写
 *   只有会写才会在开发的时候注意这个问题
 */
public class DeadLockTest01 {
    public static void main(String[] args) {
        Object o1 =new Object();
        Object o2 = new Object();
        //t1和t2共享o1和o2
        Thread t1 = new MyThread1(o1,o2);
        Thread t2 = new MyThread2(o1,o2);

        t1.start();
        t2.start();
    }
}

class MyThread1 extends Thread{
    Object o1;
    Object o2;
    public MyThread1(Object o1,Object o2){
        this.o1 = o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o1){
            System.out.println("MyThread1开始");
            synchronized (o2){
                System.out.println("MyThread1结束");
            }
        }
    }
}

class MyThread2 extends Thread{
    Object o1;
    Object o2;
    public MyThread2(Object o1,Object o2){
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2){
            System.out.println("MyThread2开始");

            synchronized (o1){
                System.out.println("MyThread2结束");
            }
        }
    }
}