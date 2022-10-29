package 实现生产者和消费者模式.左右手写字;

/**
 * @date 2022/10/10 - 8:38
 */
public class Right01 implements Runnable{
    Str str;
    public Right01(Str str){
        this.str = str;
    }

    @Override
    public void run() {
        while (true){
            synchronized (str){
                if (!"右".equals(str.getS())){
                    try {
                        str.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"--->"+str.getS());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                str.setS("左");
                str.notifyAll();
            }
        }
    }
}
