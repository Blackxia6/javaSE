package 线程安全问题账户问题.保证静态代码块安全;

/**
 * @date 2022/10/7 - 20:59
 * 面试题：doOther方法执行时需要等待doSome方法执行结束吗？
 *    不需要 因为doOther方法没有synchronized,不需要锁
 */
public class Exam01 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        MyThread t1 = new MyThread(mc);
        MyThread t2 = new MyThread(mc);
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

class MyThread implements Runnable{
    private MyClass mc;

    public MyThread(MyClass mc) {
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
class MyClass{
    public synchronized void doSome(){//synchronized使用在实例方法那，锁就是this
        System.out.println("doSome begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }
//    public synchronized void doOther(){
    public  void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}