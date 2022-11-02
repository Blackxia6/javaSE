package 注解中定义属性.test2;

/**
 * @date 2022/10/12 - 21:39
 */
public @interface MyAnnotation {
    //指定一个value属性
    String value();//属性名为value，运用时可以不写属性名
}
