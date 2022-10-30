package 获取Field.bean;

/**
 * @date 2022/10/11 - 21:04
 * 反射属性Field
 */
public class Student {
    //Field翻译为字段，其实就是属性/成员变量
    //四个Field分别采用了不同的访问控制权限修饰符
    public int no;//    public int no;这是一个Field对象
    private String name;
    public int age;
    protected int classNum;
    boolean sex;
    public static final double PI = 3.1415926;


}
