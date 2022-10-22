package String类里的方法;

/**
 * @date 2022/9/15 - 17:18
 */
public class 返回指定子字符串在此字符串中第一次出现处的索引 {
    public static void main(String[] args) {
        //int indexOf(String str)   返回指定子字符串在此字符串中第一次出现处的索引。
        System.out.println("abcsjdfas jfhj".indexOf("s"));//3
        System.out.println("abc".length());//3

        //判断子字符串在当前字符串中最后一次出现的索引
        System.out.println("abcsjdfas jfhj".lastIndexOf("j"));//13

    }
}
