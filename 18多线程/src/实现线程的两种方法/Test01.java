package 实现线程的两种方法;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @date 2022/10/9 - 21:47
 */
public class Test01 {
    public static void main(String[] args) {
        A1 a = new A1();
        FutureTask task = new FutureTask(a);//未来任务类
        Thread t = new Thread(task);//转成线程对象
        t.start();
        try {
            task.get();//获取返回值
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("hello world");
    }
}
class A1 implements Callable{

    @Override
    public Object call() throws Exception {
        System.out.println("begin");
        Thread.sleep(1000);
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("end");
        return a+b;
    }
}