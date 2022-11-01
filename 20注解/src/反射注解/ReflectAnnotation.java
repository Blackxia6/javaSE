package 反射注解;

/**
 * @date 2022/10/12 - 22:10
 * 获取类上的注解
 */
public class ReflectAnnotation {
    public static void main(String[] args) throws Exception{
        //先获取类
            Class c = Class.forName("反射注解.MyAnnotationTest");
            //判断MyAnnotationTest类上是否有@MyAnnotation
        System.out.println(c.isAnnotationPresent(MyAnnotation.class));//true
        if (c.isAnnotationPresent(MyAnnotation.class)){//如果有注解，获取注解
            //获取注解对象
            MyAnnotation myAnnotation = (MyAnnotation)c.getAnnotation(MyAnnotation.class);
            System.out.println("MyAnnotationTest类上面的注解对象--->"+myAnnotation);
            //获取注解对象的属性 和调接口没区别
            System.out.println(myAnnotation.value());

        }
        //判断String类上是否有
        Class stringClass = Class.forName("java.lang.String");
        System.out.println(stringClass.isAnnotationPresent(MyAnnotation.class));//false

    }
}
