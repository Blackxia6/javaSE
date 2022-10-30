package 通过反射实例化对象;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @date 2022/10/10 - 15:52
 * 验证反射机制的灵活性
 *  java代码写一遍，在不改变java源代码的基础之上，可以做到不同对象的实例化
 *  非常灵活（符合OCP开闭原则：对扩展开放，对修改关闭）
 *
 * 后期我们学习高级框架，工作的时候也是使用高级框架
 * 包括ssh ssm spring springMVC
 */
public class ReflectTest02 {
    public static void main(String[] args) throws Exception {
        //通过IO流读取classinfo.properties文件
        FileReader reader = new FileReader("19反射机制/classinfo1.properties");
        //创建属性类Map
        Properties pro = new Properties();
        //加载
        try {
            pro.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();


        String className = pro.getProperty("className");
        //System.out.println(className);
        //通过反射机制实例化对象
        Class c = Class.forName(className);//创建实例化对象
        Object obj = c.newInstance();
        System.out.println(obj);
    }
}
