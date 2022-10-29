package 车站maipiao;

/**
 * @date 2022/10/9 - 16:17
 */
public class ThreadGet extends Thread{
    int num = 1;
    QCZ qcz;
    public ThreadGet(int num,QCZ qcz){
        this.num = num;
        this.qcz = qcz;
    }

    @Override
    public void run() {
        qcz.Sell(num);//买票
    }
}
