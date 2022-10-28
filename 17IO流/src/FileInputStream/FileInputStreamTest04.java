package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/10/1 - 16:51
 */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("17IO流/src/FileInputStream/tempfile");
            byte[] bytes = new byte[4];
            int count = fis.read(bytes);//读取字节的个数(最多读4个字节）4个
            System.out.println(count);
            String s1 = new String(bytes,0,count);//把byte数据转换成string类型 从0下标开始转，到count结束
            System.out.println(s1);

            count = fis.read(bytes);//读取字节的个数 2个
            System.out.println(count);
            String s2 = new String(bytes,0,count);//把byte数据转换成string类型 从0下标开始转，到count结束
            System.out.println(s2);

            count = fis.read(bytes);//读取字节的个数 0个(没有了）
            System.out.println(count);//-1

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
