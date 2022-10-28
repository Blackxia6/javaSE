package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/10/1 - 16:22
 * int read(byte[] b)
 *   一次最多读取b.length个字节
 *   减少硬盘和内存的交互，提高程序的执行效率
 *   往byte数组当中读
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //fis = new FileInputStream("tempfile");//在idea中默认的当前路径是project的根
            fis = new FileInputStream("17IO流/src/FileInputStream/tempfile");
            //开始读，采用byte数组 一次读取多个字节，最多读取 数组.length个字节
            byte[] bytes = new byte[4];//准备一个长度为4的byte数组，一次最多读取4个字节
            int readCount = fis.read(bytes);//这个方法返回的是读到的字节数量（不是字节本身）
            System.out.println(readCount);//4个字节输出4

            String s1 = new String(bytes);//将字节数组全部转换成字符串
            System.out.println(s1);//abcd
            readCount = fis.read(bytes);
            System.out.println(readCount);//2 剩下两个字节

            String s2 = new String(bytes);//将字节数组全部转换成字符串
            System.out.println(s2);//efcd
            readCount = fis.read(bytes);
            System.out.println(readCount);//-1 没有读到字节

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
