package 实现生产者和消费者模式.左右手写字;

/**
 * @date 2022/10/10 - 8:37
 */
public class Left01 implements Runnable{
    Str str ;
    public Left01(Str str){
        this.str = str;
    }

    @Override
    public void run() {
        while (true){
            synchronized (str){
                if (!"左".equals(str.getS())){
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
                str.setS("右");
                str.notifyAll();
            }
        }
    }
}
