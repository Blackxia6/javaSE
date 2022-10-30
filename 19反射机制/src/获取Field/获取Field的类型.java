package 获取Field;

import java.lang.reflect.Field;

/**
 * @date 2022/10/11 - 21:27
 */
public class 获取Field的类型 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class name1 = Class.forName("获取Field.bean.Student");
        //拿到所有的Field
        Field[] fields = name1.getDeclaredFields();
        for (Field field : fields){
            //获取Field的名字
            System.out.println(field.getName()+"---->"+field.getType());
            //获取属性的类型
//            System.out.println(field.getType());
            Class fileType = field.getType();
            String fName = fileType.getName();
            System.out.println("完整名字=="+fName);//获取完整名字
            System.out.println("简易名字=="+fileType.getSimpleName());//获取简单名字
            System.out.println("-----------------------------------------");
        }
    }
}
