package 线程安全问题账户问题.ThreadSafeTest01;

/**
 * @date 2022/10/7 - 15:44
 * 银行账户类
 *   不使用线程同步机制，多线程对同一个账户进行取款，会出现线程安全问题
 */
public class Account {
    private String actno;//账号
    private double balance;//余额

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
    public synchronized void  withdraw(double money){//在实例方法上使用synchronized（锁一定是this）

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
