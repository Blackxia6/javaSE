package 通过反射机制访问对象的属性;

import java.lang.reflect.Field;

/**
 * @date 2022/10/11 - 22:47
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            //通过反射机制拿到 Student的Class
            Class studentClass = Class.forName("获取Field.bean.Student");
            //通过反射机制创建对象
            Object obj = studentClass.newInstance();
            //通过反射机制拿到obj对象中的某个属性
            Field noField = studentClass.getDeclaredField("no");
            Field ageField = studentClass.getDeclaredField("age");
            //通过反射机制给拿到的属性赋值
            noField.set(obj,1111111);
            ageField.set(obj,20);
            //读取属性的值
            Object object = noField.get(obj);
            Object obj1 = ageField.get(obj);
            System.out.println(object);
            System.out.println(obj1);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
