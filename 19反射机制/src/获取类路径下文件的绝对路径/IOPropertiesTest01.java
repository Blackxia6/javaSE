package 获取类路径下文件的绝对路径;

import java.io.FileReader;
import java.util.Properties;

/**
 * @date 2022/10/10 - 20:26
 */
public class IOPropertiesTest01 {
    public static void main(String[] args) throws Exception{
        //获取文件的绝对路径
        String path = Thread.currentThread().getContextClassLoader().
                getResource("classinfo2.properties").toURI().getPath();
        //输出绝对路径
        System.out.println(path);
        FileReader reader = new FileReader(path);
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        //通过key获取value
        String className = pro.getProperty("className");
        System.out.println(className);
        Class c  = Class.forName(className);
        Object obj = c.newInstance();//创建User实例--->相当于new对象(newInstance调用的是无参数构造方法)
        System.out.println(obj);

    }
}
