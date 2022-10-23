/**
 * @date 2022/9/17 - 10:44
 */
public class String_int_Integer类型转换 {
    public static void main(String[] args) {
        //int--->string
        String s1 = String.valueOf(100);
        //string--->int
        int i1 = Integer.parseInt("100");
        //int---->Integer
        Integer i2 = 100;//自动装箱
        //Integer--->int
        int i3 = i2;//自动拆箱
        //string--->Integer
        Integer i4 = Integer.valueOf("100");
        //Integer---->string
        Integer i5 = 101;//自动装箱
        String s2 = String.valueOf(i5);
    }
}
