package Sleep方法;

/**
 * @date 2022/10/6 - 20:41
 *  终止sleep方法提前让线程醒过来
 */
public class 终止sleep方法 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable01());
        t.setName("ttt");
        t.start();

        //希望5秒之后线程醒来
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //中断ttt线程的睡眠
        t.interrupt();//靠异常处理机制，中断睡眠

    }
}

class MyRunnable01 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---->begin");
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"---->end");
    }
}