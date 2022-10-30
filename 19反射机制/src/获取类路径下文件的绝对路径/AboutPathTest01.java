package 获取类路径下文件的绝对路径;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @date 2022/10/10 - 17:21
 * 研究一下文件路径的问题
 */
public class AboutPathTest01 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            //这种方式的路径缺点是：代码移植性差，在IDEA中默认的路劲是project的根
            //这个代码假设离开了IDEA换到其他位置，可能当前路劲就不是project的根了，这时路径就无效了
             reader = new FileReader("19反射机制/classinfo1.properties");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
