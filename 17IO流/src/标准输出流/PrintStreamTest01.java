package 标准输出流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @date 2022/10/3 - 19:52
 * java.io.PrintStream:标准的字节输出流，默认输出到控制台
 */
public class PrintStreamTest01 {
    public static void main(String[] args) {//标准输出流不需要手动关闭
        //联合写
        System.out.println("hello world");
        //分开写
        PrintStream ps = System.out;
        ps.println("hello");

        try {
            //标准输出流不在指向控制台，指向logTest文件
            PrintStream printStream = new PrintStream(new FileOutputStream("logTest",true));
            //修改输出方向，将输出方向修改到logTest文件
            System.setOut(printStream);
            //System.setOut(new PrintStream(new FileOutputStream("logTest")));
            //再次输出
            System.out.println("hello kitty");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
