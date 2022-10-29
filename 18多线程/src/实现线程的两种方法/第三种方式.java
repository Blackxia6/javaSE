package 实现线程的两种方法;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;//JUC包下 属于java的并发包，老JDK中没有这个包

/**
 * @date 2022/10/9 - 21:31
 * 实现线程的第三种方法
 *  实现Callable接口 这个线程有返回值
 */
public class 第三种方式 {
    public static void main(String[] args) {
        //第一步创建一个“未来任务类”对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call 方法相当于run方法，只不过这里有返回值
                //模拟执行
                System.out.println("call method began");
                Thread.sleep(10000);
                System.out.println("call method end");
                int a = 100;
                int b = 200;

                return a+b;//自动装箱
            }
        });
        //创建线程对象
        Thread t = new Thread(task);
        //启动线程
        t.start();

        //在主线程中获取t线程的返回值
        try {
            Object obj = task.get();//获取返回值
            System.out.println(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("hello world");
    }
}


