package 获取Field;

import java.lang.reflect.Field;

/**
 * @date 2022/10/11 - 21:04
 * 反射Student中的所有的Field（属性）
 */
public class FieldTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取整个类
        Class studentClass = Class.forName("获取Field.bean.Student");
        System.out.println("Student类的完整类名="+studentClass.getName());//获取完整类名
        System.out.println("Student类的简类名="+studentClass.getSimpleName());//获取简类名

        //获取类中的所有的Field
        Field[] fields = studentClass.getFields();//这个方法可以获取类中被public和static修饰的属性
        System.out.println(fields.length);//1
        //取出这个Field
        Field f = fields[0];
        //取出这个Filed它的名字
        String fName = f.getName();//获取属性的名字
        System.out.println(fName);
        System.out.println("==================");
        //获取所有的Field
        Field[] fs = studentClass.getDeclaredFields();//这个方法可以修饰类中所有的属性（不管是什么访问控制权限修饰符修饰的）
        System.out.println(fs.length);//4

        //遍历
        for (Field field : fs){
            System.out.println(field.getName());//获取属性的名字

        }

    }
}
