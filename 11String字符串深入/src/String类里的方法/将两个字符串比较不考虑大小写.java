package String类里的方法;

/**
 * @date 2022/9/15 - 17:09
 */
public class 将两个字符串比较不考虑大小写 {
    public static void main(String[] args) {
        //boolean equalsIgnoreCase(String anotherString) 将此 String 与另一个 String 比较，不考虑大小写。
        System.out.println("abc".equalsIgnoreCase("Abc"));//true
        System.out.println("abc".equals("Abc"));//false
    }
}
