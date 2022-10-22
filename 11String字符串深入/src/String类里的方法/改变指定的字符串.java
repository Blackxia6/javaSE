package String类里的方法;

/**
 * @date 2022/9/15 - 17:33
 */
public class 改变指定的字符串 {
    public static void main(String[] args) {
        // String replace(CharSequence target, CharSequence replacement) 使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
        String newString = "http://www,baidu.com".replace("http","https");
        System.out.println(newString);
        //把以下的字符串都替换成  ":"
        String newString1 = "name=zhagnsn age=20 sex=1".replace("=",":");
        System.out.println(newString1);
    }

}
