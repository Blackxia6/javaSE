package 文件复制;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @date 2022/10/2 - 23:00
 * 使用FileReader和FileWriter拷贝文件只能拷贝普通文本文件
 *能用记事本编辑的都是普通文本文件
 */
public class Copy02 {
    public static void main(String[] args) {
        FileReader fir = null;
        FileWriter fiw = null;
        try {
            fir = new FileReader("D:\\IDEA\\javase\\17IO流\\src\\文件复制\\Copy02.java");
            fiw = new FileWriter("Copy02.java");
            char[] chars = new char[4];
            int count = 0;
            while ((count = fir.read(chars)) != -1){
                fiw.write(chars,0,count);
            }
            fiw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fir != null) {
                try {
                    fir.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fiw != null) {
                try {
                    fiw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
