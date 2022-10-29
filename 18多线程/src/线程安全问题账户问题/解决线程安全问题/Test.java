package 线程安全问题账户问题.解决线程安全问题;

/**
 * @date 2022/10/7 - 15:53
 */
public class Test {
    public static void main(String[] args) {
        //创建账户对象
        Account act = new Account("act-001",10000);
        //创建两个线程
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        t1.setPriority(10);
        t2.setPriority(1);
        t1.setName("t1");
        t2.setName("t2");
        //启动线程取款
        t1.start();
        t2.start();



    }
}
