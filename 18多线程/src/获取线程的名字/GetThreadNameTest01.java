package 获取线程的名字;

/**
 * @date 2022/10/5 - 22:56
 */
public class GetThreadNameTest01 {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        //设置线程的名字
        t.setName("t1");
        //获取线程的名字
        String threadName = t.getName();
        System.out.println("线程的名字:"+threadName);
        //启动线程
        t.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("主线程--->"+i);
        }
    }
}

class A implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            Thread t = Thread.currentThread();
            System.out.println("分支线程"+t.getName()+"--->"+i);
        }
    }
}