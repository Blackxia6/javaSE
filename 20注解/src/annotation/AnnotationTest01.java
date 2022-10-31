package annotation;

/**
 * @date 2022/10/12 - 19:03
 * 1.注解/注释 英文单词是--->annotation
 * 2.注解（annotation)是一种引用数据类型。编译之后也是生成xxx.class文件
 * 3.怎么定义注解呢？
 *   [修饰符列表] @interface 注解类型名{....}
 */
@MyAnnotation
public class AnnotationTest01 {
    @MyAnnotation
    private int no;
    @MyAnnotation
    public AnnotationTest01(){

    }
    @MyAnnotation
    public AnnotationTest01(int no){
        this.no = no;
    }
    @MyAnnotation
    public static void m1(){
        @MyAnnotation
        int i = 100;
    }
    @MyAnnotation
    public void m2(@MyAnnotation String name){

    }
}
