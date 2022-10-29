package 强行终止线程执行;

import java.util.concurrent.TimeUnit;

/**
 * @date 2022/10/6 - 21:07
 * 合理的终止一个线程的执行
 */
public class 合理的终止线程 {
    public static void main(String[] args) {
        MyRunnable03 r = new MyRunnable03();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        //模拟5秒
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //终止线程
        r.run=false;
    }
}
class MyRunnable03 implements Runnable{
    //打一个boolean标记
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if (run){
                System.out.println(Thread.currentThread().getName()+"--->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {

                return;
            }
        }

    }
}