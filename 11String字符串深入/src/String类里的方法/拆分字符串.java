package String类里的方法;

/**
 * @date 2022/9/15 - 17:39
 */
public class 拆分字符串 {
    public static void main(String[] args) {
        //String[] split(String regex) 根据给定正则表达式的匹配拆分此字符串。
        String[] str = "1990-8-10".split("-");
        for (int i = 0; i <str.length; i++) {
            System.out.println(str[i]);
        }

        String[] newString1 = "name=zhagnsn age=20 sex=1".split(" ");
//        for (int i = 0; i <newString1.length ; i++) {
//            String[] a = newString1[i].split("=");
//            for (int j =0;j<a.length;j++){
//                System.out.println(a[j]);
//            }
//        }
        for (int i = 0; i <newString1.length ; i++) {
            System.out.println(newString1[i]);
        }
    }
}
