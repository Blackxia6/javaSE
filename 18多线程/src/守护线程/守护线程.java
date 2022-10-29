package 守护线程;

/**
 * @date 2022/10/9 - 17:09
 *守护线程：主线程执行结束，守护线程也执行结束
 */
public class 守护线程 {
    public static void main(String[] args) {
        BakDataThread bdt = new BakDataThread();
        Thread thread1 = new Thread(bdt);
        thread1.setName("备份数据的线程");

        //启动线程之前将线程设置为守护线程
        thread1.setDaemon(true);
        thread1.start();
        //主线程
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
class BakDataThread implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while (true){
            System.out.println(Thread.currentThread().getName()+"--->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
