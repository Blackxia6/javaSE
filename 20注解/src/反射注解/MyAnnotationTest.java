package 反射注解;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @date 2022/10/12 - 22:13
 */
@MyAnnotation
public class MyAnnotationTest {
    int i;

    @MyAnnotation
    public void doSome(){
        int i ;
    }
}
