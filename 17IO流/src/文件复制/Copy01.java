package 文件复制;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @date 2022/10/2 - 21:41
 * 使用FileInputStream和FileOutputStream完成文件的拷贝
 * 拷贝的过程是一边读一边写
 * 使用以上字节流老被文件的时候，文件类型随意，万能的，什么文件都可以拷贝
 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("C:\\Users\\夏文建\\Desktop\\新建文本文档 (3).txt");//创建一个输入流对象
            fos = new FileOutputStream("C:\\Users\\夏文建\\Desktop\\同上一堂思政课观后感\\111.txt");//创建一个输出流对象

            byte[] bytes = new byte[1024*1024];//一次拷贝1MB
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1){//一边读一边写
                fos.write(bytes,0,readCount);
            }

            fos.flush();//输出流最后要刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //异常要分开处理，否者一个出现异常，下一个流可能关闭不了
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
