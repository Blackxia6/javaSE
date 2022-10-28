package FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @date 2022/10/2 - 21:27
 */
public class FileOutputStreamTest02 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //true表示在文件末尾添加，不清空原文件
            fos = new FileOutputStream("D:\\IDEA\\javase\\17IO流\\myfile.text",true);
            byte[] bytes = {97,98,99,100};
            fos.write(bytes);
            String s = "我是一个中国人，国庆快乐";
            byte[] bytes1 =s.getBytes();//将字符串转换成数组
            fos.write(bytes1);

            //写完输出流之后一定要刷新一下
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
