package 实现生产者和消费者模式.Test;

/**
 * @date 2022/10/9 - 23:24
 */
public class 交替输出 {
    public static void main(String[] args) {
        Num num = new Num(1);
        //创建两个线程对象
        Thread t1 = new Thread(new J(num));
        Thread t2 = new Thread(new O(num));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
//第一个输出奇数
class J implements Runnable{
    Num num;
    public J(Num num){
        this.num = num;
    }
    @Override
    public void run() {
        while (true){
            synchronized (num){
                if(num.i%2 == 0){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能运行到这说明i为奇数
                System.out.println(Thread.currentThread().getName()+"--->"+num.i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num.i = num.i+1;

                //唤醒
                num.notifyAll();
            }
        }
    }
}
//第二个输出偶数
class O implements Runnable{
    Num num;
    public O(Num num){
        this.num = num;
    }

    @Override
    public void run() {
        while (true){
            synchronized (num){
                if (num.i%2 !=0){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够运行到这说明i为偶数
                System.out.println(Thread.currentThread().getName()+"--->"+num.i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num.i = num.i+1;
                //唤醒
                num.notifyAll();
            }
        }
    }
}
class Num{
    int i ;
    public Num(int i){
        this.i = i;
    }
}
