package 获取Field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @date 2022/10/11 - 21:37
 */
public class 获取Field的修饰符 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class className = Class.forName("获取Field.bean.Student");
        Field[] fields = className.getDeclaredFields();
        for (Field field : fields){
            Class getType = field.getType();
            System.out.println("================"+getType);
            String getTypeName = getType.getName();
            //获取Field的修饰符列表
            int modify = field.getModifiers();//返回的修饰符是一个数字，每个数字是修饰符的代号
            //将修饰的的代号转换成字符串
            String modifyName = Modifier.toString(modify);//修饰符列表字符串
            System.out.println(getTypeName+"---->"+field.getName()+"----->"+modify+"--->"+modifyName);

        }
    }
}
