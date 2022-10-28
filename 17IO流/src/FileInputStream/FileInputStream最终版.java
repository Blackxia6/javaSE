package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/10/1 - 16:59
 */
public class FileInputStream最终版 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("17IO流/src/FileInputStream/temp");
            //准备一个byte数组
            byte[] bytes = new byte[4];
            /*while (true){
                int count = fis.read(bytes);//读到的字节数量（最大4个）
                if (count == -1){
                    break;
                }
                String s1 = new String(bytes,0,count);//把byte数组转换成字符串，读到多少个转换多少个
                System.out.print(s1);
            }*/
            int count = 0;
            while ((count = fis.read(bytes)) != -1){
                System.out.print(new String(bytes,0,count));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
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
