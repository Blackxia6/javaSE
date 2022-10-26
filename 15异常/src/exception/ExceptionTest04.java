package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/9/20 - 14:28
 */
public class ExceptionTest04 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("新建文本文档 (2).txt");

            System.out.println(100/0);//这个异常是运行时异常，可以不处理
        } catch (IOException e) {//多态:IOException e = new FileInputStream();
            System.out.println("没有找到文件");
        }
        System.out.println("hello world");
    }
}
