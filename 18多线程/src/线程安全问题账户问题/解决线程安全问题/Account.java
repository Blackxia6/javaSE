package 线程安全问题账户问题.解决线程安全问题;

/**
 * @date 2022/10/7 - 15:44
 * 银行账户类
 *   使用线程同步机制解决线程安全问题
 */
public class Account {
    private String actno;//账号
    private double balance;//余额

    Object obj = new Object();

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款方法
    public void withdraw(double money){
        //以下这几行代码必须是线程排队是不能并发
        //一个线程把这里的代码全部执行结束之后，另一个线程才会执行
        //System.out.println(Thread.currentThread().getName()+"开始执行");
        //synchronized后面的小括号里的“数据”是相当关键的，这个数据必是多线程共享的数据才能达到多线程排队
        //()这里面怎么写，那要看你想让哪些线程同步
        //假设t1,t2,t3,t4,t5 有五个线程，你只希望t1 t2 t3排队，你要在()中写一个t1 t2 t3 共享的对象
        synchronized (this){
            //取款之前的余额
            double before = this.balance;

            //取款之后的余额
            double after = before-money;
            //在这里模仿一下网络延迟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //更新余额
            this.setBalance(after);
        }
    }

}
