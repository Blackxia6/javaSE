package 注解在开发中的作用;

import java.lang.reflect.Field;

/**
 * @date 2022/10/12 - 22:40
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //获取类
        Class c = Class.forName("注解在开发中的作用.User");
        //判断类上是否有Id注解
        if (c.isAnnotationPresent(Id.class)){
            //当一个类中有Id注解时，要求类中必须存在int类型的id属性
            //获取类的所有属性
            Field[] fields = c.getDeclaredFields();
            boolean isRight = false;//给一个默认的标记
            for (Field field : fields){
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())){
                    //表示这个类是合法的
                    isRight = true;//表示合法
                    break;
                }
            }
            //判断是否合法
            if (!isRight){
                throw new NotHasIdPropertyException("被@Id注解标注的类中必须要有一个int类型的id属性");
            }
        }
    }
}
