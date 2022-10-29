package 实现生产者和消费者模式.Test02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @date 2022/10/9 - 23:38
 */
public class 交替输出 {
    public static void main(String[] args) {
        //创建一个仓库对象 共享的
        LinkedList list = new LinkedList();
        //System.out.println(list.size());
        //创建两个线程对象
        //生产线程
        Thread t1 = new Thread(new Producer(list));
        //消费线程
        Thread t2 = new Thread(new Consumer1(list));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}


//生产线程
class Producer implements Runnable{
    private LinkedList list;//仓库
    public Producer(LinkedList list){
        this.list = list;
    }

    @Override
    public void run() {
        //一直生产(使用死循环一直生产)
        while (true){
            //给仓库list对象加锁
            synchronized (list) {
                if (list.size() % 2 == 0) {
                    //仓库满了，当前线程进入等待状态，并且释放list集合的锁
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"--->"+list.size());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Object obj = new Object();
                list.add(obj);

                //唤醒消费者
                list.notifyAll();
            }
        }

    }
}

//消费线程
class Consumer1 implements Runnable{
    private LinkedList list;//仓库
    public Consumer1(LinkedList list){
        this.list = list;
    }
    @Override
    public void run() {
        //一直消费
        while (true){
            synchronized (list){
                if (list.size() %2 != 0){
                    //仓库空了,消费者线程等待，释放掉被Consumer对象占用锁
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName()+"--->"+list.size());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Object obj = new Object();
                list.add(obj);

                //唤醒生产者生产
                list.notifyAll();
            }
        }
    }
}
