package Hashtable;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @date 2022/9/27 - 22:03
 * properties是一个map集合，Properties的key和value都是string类型
 * Properties被称为属性对象类
 * Properties是线程安全的
 */
public class PropertiseTest01 {
    public static void main(String[] args) {
        //创建一个propertise对象

        Properties pro = new Properties();
        pro.setProperty("username","root");
        pro.setProperty("password","123");
        //通过key获取value
        String user = pro.getProperty("username");
        String password = pro.getProperty("password");
        System.out.println(user+" "+password);
        Set set = pro.entrySet();
        for (Object s : set){
            System.out.println(s);
        }

    }
}
