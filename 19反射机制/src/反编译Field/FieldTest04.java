package 反编译Field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @date 2022/10/11 - 22:12
 * 通过反射机制反编译一个类的属性Field(了解）
 *  给一个class文件我可以输出java源码
 */
public class FieldTest04 {
    public static void main(String[] args) throws ClassNotFoundException {
        //创建这个是为了拼接字符串
        StringBuilder s = new StringBuilder();

        Class studentClass = Class.forName("获取Field.bean.Student");
        s.append(Modifier.toString(studentClass.getModifiers()) +" class "+studentClass.getSimpleName()+"{\n");

        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields){
            s.append("\t");
            s.append(Modifier.toString(field.getModifiers()));
            s.append(" ");
            s.append(field.getType().getSimpleName());
            s.append(" ");
            s.append(field.getName());
            s.append(";\n");
        }
        s.append("}");
        System.out.println(s);
    }
}
