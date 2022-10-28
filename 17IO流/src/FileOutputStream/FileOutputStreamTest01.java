package FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @date 2022/10/2 - 21:15
 * 文件字节输出流
 *   从内存到硬盘
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //这种方式会将源文件清空，再写入
            fos = new FileOutputStream("D:\\IDEA\\javase\\17IO流\\myfile.text");//文件不存在的时候会自动新建
            byte[] bytes = {97,98,99,100};
            //写(将byte数组全部写出)
            fos.write(bytes);
            fos.write(bytes,0,2);//写入byte数组的一部分

            //写完输出流之后一定要刷新一下
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
