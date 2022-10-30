package 获取Class的三种方式;

import java.util.Date;

/**
 * @date 2022/10/10 - 10:50
 * java语言中任何一种类型，包括基本数据类型，它们都有.class属性
 */
public class ThirdMethod {
    public static void main(String[] args) {
        String x = "a";
        Class a = x.getClass();
        Class b = null;
        try {
             b = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class z = String.class;//z代表string类型
        Class k = Date.class;
        Class f = int.class;//f代表int类型

        System.out.println(a == z);//true
        System.out.println(z == b);//true
    }
}
