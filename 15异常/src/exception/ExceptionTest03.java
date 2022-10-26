package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @date 2022/9/19 - 22:35
 */
public class ExceptionTest03 {
    public static void main(String[] args)  {
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }

    private static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() {
        //调用Sun JDK中某个类的构造方法
        //没有异常捕捉会报错，因为该对象是有异常抛出的构造方法
        System.out.println("m3 begin");
        try {
            new FileInputStream("C:\\Users\\夏文建\\Desktop\\新建文本文档 (2)txt");//创建一个输入流对象，该流指向一个路径
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            //System.exit(0);//退出JVM
        }
        System.out.println("m3 over");
    }
}
