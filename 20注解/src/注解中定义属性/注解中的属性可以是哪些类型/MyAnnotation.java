package 注解中定义属性.注解中的属性可以是哪些类型;

import 注解中定义属性.test2.MyAnnotationTest;

/**
 * @date 2022/10/12 - 21:49
 */
public @interface MyAnnotation {
    //注解当中的属性可以是哪些类型 byte short int long float double boolean char Class String 枚举类型 以及他们的数组形式
//    Object value();//报错
    int value1();
    String value2();
    int[] value3();
    String[] value4();
    Class class1();

}
