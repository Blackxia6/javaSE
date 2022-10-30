package 获取类路径下文件的绝对路径;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @date 2022/10/10 - 20:43
 */
public class IOPropertiesTest02 {
    public static void main(String[] args)  {
        //直接以流的形式返回
           InputStream reader =  Thread.currentThread().getContextClassLoader().
                   getResourceAsStream("classinfo2.properties");
        Properties pro = new Properties();
        try {
            pro.load(reader);
        } catch (IOException e) {
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
        String className = pro.getProperty("className");
        System.out.println(className);

    }
}
