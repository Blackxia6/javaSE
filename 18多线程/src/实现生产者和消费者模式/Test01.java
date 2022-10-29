package 实现生产者和消费者模式;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @date 2022/10/9 - 22:23
 * 使用wait方法和notify方法实现生产者和消费者模式
 *   生产线程负者生产 消费线程负者消费
 *   生产线程和消费线程要达到均衡
 *   这是一种特殊的业务需求，这种情况要使用wait方法和notify方法
 *
 *   模拟这样一搞需求
 *     仓库我们采用list集合
 *      1个元素就表示仓库满了
 *      如果list集合元素个数是0，就表示仓库空了
 *      保证list集合中永远最多存储一个元素
 *      必须做到 生产一个就消费一个
 */
public class Test01 {
    public static void main(String[] args) {
        //创建一个仓库对象 共享的
        List list = new ArrayList();
        //创建两个线程对象
        //生产线程
        Thread t1 = new Thread(new Producer(list));
        //消费线程
        Thread t2 = new Thread(new Consumer1(list));
        t1.setName("生产者线程");
        t2.setName("消费者线程");

        t1.start();
        t2.start();
    }
}
//生产线程
class Producer implements Runnable{
    private List list;//仓库
    public Producer(List list){
        this.list = list;
    }

    @Override
    public void run() {
        //一直生产(使用死循环一直生产)
        while (true){
            //给仓库list对象加锁
            synchronized (list) {
                if (list.size() > 0) {
                    //仓库满了，当前线程进入等待状态，并且释放list集合的锁
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到这里说明仓库是空的
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+"--->"+obj);
                //唤醒消费者
                list.notifyAll();
            }
        }

    }
}

//消费线程
class Consumer1 implements Runnable{
    private List list;//仓库
    public Consumer1(List list){
        this.list = list;
    }
    @Override
    public void run() {
        //一直消费
        while (true){
            synchronized (list){
                if (list.size() == 0){
                    //仓库空了,消费者线程等待，释放掉被Consumer对象占用锁
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    //仓库里有东西,进行消费
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName()+"--->"+obj);
                //唤醒生产者生产
                list.notifyAll();
            }
        }
    }
}
