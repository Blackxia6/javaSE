package IO和Propertise联合使用;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @date 2022/10/4 - 20:26
 * 现在想将文件中的数据加载到Properties对象中
 */
public class IOPropertisesTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\IDEA\\javase\\17IO流\\src\\IO和Propertise联合使用\\a.properties");
            Properties properties = new Properties();
            //调用Properties对象的load方法，将文件中的数据加载到map集合中,其中等号左边做key，右边做value
            properties.load(fis);
            //通过key来获取value
            String name = properties.getProperty("username");
            System.out.println("用户名:"+name);
            String pass = properties.getProperty("password");
            System.out.println("密码:"+pass);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
