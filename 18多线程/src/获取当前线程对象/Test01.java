package 获取当前线程对象;

/**
 * @date 2022/10/5 - 23:09
 */
public class Test01 {
    public static void main(String[] args) {
        //这个代码出现在main方法当中，所以当前线程就是主线程
        Thread t = Thread.currentThread();
        System.out.println(t.getName());//main
        System.out.println(t.getPriority());
        B b = new B();
        B b1 = new B();
        b.setName("1111");
        b1.setName("2222");
        b1.start();
        b.start();
        System.out.println(b1.getPriority());
        System.out.println(b.getPriority());
        C c = new C();
        Thread thread = new Thread(c);
        thread.start();
        System.out.println(thread.getPriority());

    }
}

class B extends Thread{
    @Override
    public void run() {
        //这个currentThread就是当前线程对象
        Thread t = Thread.currentThread();//哪个线程对象调用start方法这个 t就是哪个
        //System.out.println(t.getName());
        for (int i = 0; i <100 ; i++) {
            System.out.println(t.getName()+"---->"+i);
        }
    }
}

class C implements Runnable{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("====》"+t.getName());
    }
}