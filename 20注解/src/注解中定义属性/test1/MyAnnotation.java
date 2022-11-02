package 注解中定义属性.test1;

/**
 * @date 2022/10/12 - 21:30
 */
public @interface MyAnnotation {
    /**
     * 我们通常在注解当中可以定义属性，以下的name()就是一个注解的属性
     * 看着像一个方法，实际上一个属性
     * @return
     */
    //name属性
    String name();
    //颜色属性
    String color();
    //年龄属性
    int age() default 20;//默认值为20
}
