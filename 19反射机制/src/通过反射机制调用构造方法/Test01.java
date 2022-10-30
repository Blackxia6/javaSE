package 通过反射机制调用构造方法;

import java.lang.reflect.Constructor;

/**
 * @date 2022/10/12 - 18:40
 */
public class Test01 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("通过反射机制调用构造方法.bean.Vip");
        //调用无参数 的构造方法
        Object obj = c.newInstance();
        System.out.println(obj);
        //调用有参数的构造方法
        //第一步 获取到有参数的构造方法
        Constructor con = c.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);
        Object newObj = con.newInstance(110,"Jack","1990-5-5",true);
        System.out.println(newObj);

    }
}
