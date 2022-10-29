package 线程安全问题账户问题.保证静态代码块安全;

/**
 * @date 2022/10/7 - 21:47
 * 面试题：doOther方法执行时需要等待doSome方法执行结束吗？
 *   在静态方法上的synchronize 只有一把类锁（排它锁）
 */
public class Exam02 {
    public static void main(String[] args) {
        MyClass2 mc = new MyClass2();
        MyClass2 mc1 = new MyClass2();
        MyThread2 t1 = new MyThread2(mc);
        MyThread2 t2 = new MyThread2(mc1);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.setName("t1");
        thread2.setName("t2");

        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
class MyThread2 implements Runnable{
    private MyClass2 mc;

    public MyThread2(MyClass2 mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}
class MyClass2{
    //synchronized在静态方法上是找类锁（类锁只有一把）
    public synchronized static void doSome(){//synchronized使用在实例方法那，锁就是this
        System.out.println("doSome begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }
    //    public synchronized void doOther(){
    public  synchronized static void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}