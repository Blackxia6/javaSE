package 通过反射机制访问对象的属性;

import java.lang.reflect.Field;

/**
 * @date 2022/10/11 - 22:33
 * 怎么通过反射机制访问一个java对象的属性？
 *   给属性赋值（set）
 *   获取属性的值（get）
 */
public class 通过反射机制访问java对象的属性 {
    public static void main(String[] args) throws Exception {
        Class studentClass = Class.forName("获取Field.bean.Student");
        Object obj = studentClass.newInstance();//obj就是student对象

        //获取no属性(根据属性的名称来获取Field)
        Field noField = studentClass.getDeclaredField("no");
        //给obj对象的no属性赋值
        noField.set(obj,222222);//给obj对象的no属性赋值--->222222

        //读取属性的值
        Object obj1 = noField.get(obj);
        System.out.println(obj1);

        //获取私有的属性
        Field nameField = studentClass.getDeclaredField("name");
        //打破封装(反射机制的缺点：容易打破封装)
        nameField.setAccessible(true);

        nameField.set(obj,"xwj");
        System.out.println(nameField.get(obj));
    }
}
