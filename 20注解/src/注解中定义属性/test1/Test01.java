package 注解中定义属性.test1;

/**
 * @date 2022/10/12 - 21:29
 */
public class Test01 {
    //注解中有属性，必须给属性赋值(除非该属性使用了default指定了默认值)
    @MyAnnotation(name="zhangsan",color = "red",age = 12)
    public void doSome(){

    }
}
