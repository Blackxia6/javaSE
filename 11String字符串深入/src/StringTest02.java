/**
 * @date 2022/9/13 - 22:04
 */
public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);//true
        String s3 = new String("he");
        String s4 = new String("he");
        System.out.println(s3==s4);//false
        System.out.println("======================");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s3.equals(s4));//true String类重写的equals方法

    }


}
