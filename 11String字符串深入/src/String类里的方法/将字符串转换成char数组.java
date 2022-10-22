package String类里的方法;

/**
 * @date 2022/9/15 - 17:54
 */
public class 将字符串转换成char数组 {
    public static void main(String[] args) {
        char[] chars = "我是中国人".toCharArray();
        for (int i = 0; i <chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
