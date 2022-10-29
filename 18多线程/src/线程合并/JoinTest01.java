package 线程合并;

/**
 * @date 2022/10/7 - 13:36
 * 线程合并
 */
public class JoinTest01 {
    public static void main(String[] args) {
        System.out.println("main begin");
        Thread t = new Thread(new MyRunnable());
        t.start();

        //合并线程
        try {
            t.join();//t合并到当前线程当中，当前线程受阻塞，t线程执行直到结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main over");

    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
