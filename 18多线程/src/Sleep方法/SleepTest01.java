package Sleep方法;

/**
 * @date 2022/10/6 - 20:20\
 * 关于线程的sleep方法:
 *   static void sleep(long millis)
 *     1.静态方法
 *     2.参数是毫秒
 *     3.作用：让进程进入休眠状态，进入阻塞状态，放弃占有的CPU时间片，让给其他线程使用
 *       这行代码 出现在A线程当中 A线程就会进入休眠
 */
public class SleepTest01 {
    public static void main(String[] args) {
//        try {
//            //当前线程是主线程
//            Thread.sleep(5000);//休眠5秒钟
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            try {//循环一次睡眠一秒
                Thread.sleep(1000);//睡眠一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
