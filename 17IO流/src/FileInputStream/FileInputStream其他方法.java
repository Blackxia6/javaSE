package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/10/1 - 17:14
 * fis.available() 可以返回剩下没读的字节数量
 */
public class FileInputStream其他方法 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("17IO流/src/FileInputStream/tempfile");
            System.out.println("初始的字节数量:"+fis.available());
            byte[] bytes = new byte[1];
            //int readData = fis.read(bytes);//读一个字节
           // String s = new String(bytes,0,readData);
            //System.out.println(s);
            //输出还剩下的字节数量 5个
            System.out.println("还剩下"+fis.available()+"个字节没读");

            byte[] bytes1 = new byte[fis.available()];//知道文件的全部字节数量可以直接创建一个byte数组
            int count = fis.read(bytes1);
            System.out.println(new String(bytes1,0,count));

            //skip跳过几个字节不读取
            /*fis.skip(3);
            System.out.println(fis.read());//100*/

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
