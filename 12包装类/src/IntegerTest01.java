/**
 * @date 2022/9/16 - 16:06
 */
public class IntegerTest01 {
    public static void main(String[] args) {
        //将数字100转换成Integer包装类型
        Integer x = new Integer(100);//java9之后不建议使用这个构造方法
        //将String类型的数字转换成Integer包装类型
        Integer y = new Integer("100");//装箱
        int a = y.intValue();//拆箱
        System.out.println(y);
       String b = "11";

    }
}
