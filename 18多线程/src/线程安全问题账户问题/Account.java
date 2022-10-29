package 线程安全问题账户问题;

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
    public void withdraw(double money){
        //t1和t2并发这个方法。。。（t1和t2是两个栈，两个栈操作堆中的同一个对象）
        //取款之前的余额
        double before = this.balance;

        //取款之后的余额
        double after = before-money;
        //在这里模仿一下网络延迟
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //思考：t1执行到这里，但还没来的即执行这行代码，t2线程进来执行withdraw方法,此时一定出问题
        //更新余额
        this.setBalance(after);
    }
}
