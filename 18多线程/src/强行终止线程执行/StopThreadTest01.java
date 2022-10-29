package 强行终止线程执行;

/**
 * @date 2022/10/6 - 20:53
 * 强行终止一个线程stop方法
 *  不建议使用，容易丢失数据
 *
 */
public class StopThreadTest01 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable02());
        t.setName("tatata");
        t.start();
        //模拟主线程执行五秒
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //5秒后强行终止tatata线程
        t.stop();
    }
}
class MyRunnable02 implements Runnable{

    @Override
    public void run() {
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