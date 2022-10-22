package String类里的方法;

/**
 * @date 2022/9/15 - 16:37
 * 字符串比较大小用compareTo比较
 */
public class compareTo方法 {
    public static void main(String[] args) {
        //compareTo(String anotherString) 按字典顺序比较两个字符串。把数据全部转换为二进制再来比较
        //相等为0 小于为-1 大于为1
        int result = "abc".compareTo("abc");
        System.out.println(result);//0

        int result2 = "abc".compareTo("abd");
        System.out.println(result2);//-1
    }
}
