package 反射注解;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @date 2022/10/12 - 22:11
 */
@Retention(RetentionPolicy.RUNTIME)//可以被反射机制所读取
public @interface MyAnnotation {
    String value() default "夏文建";
}
