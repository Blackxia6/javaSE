package 线程让位方法;

/**
 * @date 2022/10/7 - 13:26
 */
public class YieldTest01 {
    public static void main(String[] args) {
        MyRunnable01 m = new MyRunnable01();
        Thread thread = new Thread(m);
        thread.start();
        for (int i = 0; i <10000 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}

class MyRunnable01 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10000 ; i++) {
            //每一百个让位一次
            if (i%100 == 0){
                Thread.yield();//当前线程暂停一下
            }
            System.out.println(Thread.currentThread().getName()+"=====>"+i);
        }
    }
}
