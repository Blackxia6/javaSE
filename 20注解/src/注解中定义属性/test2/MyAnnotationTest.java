package 注解中定义属性.test2;

/**
 * @date 2022/10/12 - 21:39
 */
public class MyAnnotationTest {
    @MyAnnotation(value = "1")
    public void doSome(){

    }
    @MyAnnotation("haha")//属性名为value，可以省略属性名
    public void doOther(){

    }
}
