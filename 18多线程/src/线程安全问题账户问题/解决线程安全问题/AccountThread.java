package 线程安全问题账户问题.解决线程安全问题;

/**
 * @date 2022/10/7 - 15:50
 */
public class AccountThread extends Thread{
    //两个线程必须共享同一个账户对象
    private Account act;
    //通过构造方法传递账户对象
    public AccountThread(Account act){
        this.act = act;
    }
    @Override
    public void run() {
        //run方法执行表示取款操作
        //假设取款5000
        double money = 5000;
        //取款

        act.withdraw(money);

        System.out.println(Thread.currentThread().getName()+"的"+"账户"+act.getActno()+"取款成功，余额："+act.getBalance());
    }
}
