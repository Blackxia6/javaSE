package 获取Class的三种方式;

/**
 * @date 2022/10/10 - 9:29
 * java中任何一个对象都有一个方法 getClass()
 */
public class SecondMethod {
    public static void main(String[] args) {
        Class c1 = null;
        try {
             c1 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //java中任何一个对象都有一个方法 getClass()
        String s = "abc";
        Class x = s.getClass();//x代表String.class字节码文件 x代表String类型
        try {
            Object obj = x.newInstance();
            System.out.println(obj);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(c1 == x);//true代表c1和x的内存地址相同（都指向方法区中的字节码文件）
        FirstMethod f = new FirstMethod();
        Class a = f.getClass();
        Class b = null;
        try {
             b = Class.forName("获取Class的三种方式.FirstMethod");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(b == a);//true
    }
}
