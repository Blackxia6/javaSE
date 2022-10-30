package 获取类路径下文件的绝对路径;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * @date 2022/10/10 - 20:56
 * java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容
 *  使用一下这总方式的时候，属性配置文件必须放到类路径下
 *  专门给properties文件的
 */
public class ResourceBundleTest01 {
    public static void main(String[] args) throws Exception{
        //资源绑定器，只能绑定xxx.properties文件。并且这个文件必须在类路径下。
        //并且在写路径的时候，路径后面的扩展名不能写
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");
        String className = bundle.getString("className");
        System.out.println(className);
        System.out.println("===============================================");
        ResourceBundle bundle1 = ResourceBundle.getBundle("通过反射实例化对象/bean/db");
        String className1 = bundle1.getString("className");
        System.out.println(className1);
//        try {
//            Class c = Class.forName(className);
//            Object obj = c.newInstance();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }
        FileReader reader = null;
        try {
            String path = Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").toURI().getPath();
            System.out.println(path);
             reader = new FileReader(path);
            Properties properties = new Properties();
            properties.load(reader);
            String name = properties.getProperty("className");
            System.out.println(name);
        } catch (URISyntaxException | FileNotFoundException e) {
            e.printStackTrace();
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

    }
}
