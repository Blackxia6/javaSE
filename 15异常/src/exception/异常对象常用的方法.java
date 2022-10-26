package exception;

/**
 * @date 2022/9/20 - 14:48
 */
public class 异常对象常用的方法 {
    public static void main(String[] args) {
        NullPointerException npe = new NullPointerException("空指针异常");//运行时异常不用处理

        String msg = npe.getMessage();//获取异常简单的描述信息
        System.out.println(msg);

        npe.printStackTrace();//打印异常的堆栈信息
        System.out.println("hello");
    }
}
