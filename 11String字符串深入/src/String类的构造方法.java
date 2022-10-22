/**
 * @date 2022/9/13 - 22:26
 *
 */
public class String类的构造方法 {
    public static void main(String[] args) {
        String s1 = "hello world";
        byte[] bytes = {97,98,99};//97是a 98是b 99是c
         String s2 = new String(bytes);//这个可转换字符串
         System.out.println(s2);//输出abc

        //将byte数组中的一部分转换成字符串
        String s3 = new String(bytes,1,2);//数组 起始位置 长度
        System.out.println(s3);

        //将char数组全部转换成字符串
        char[] chars = {'我','是','中','国','人'};
        String s4 = new String(chars);
        System.out.println(s4);
        String s5 = new String(chars,2,3);
        System.out.println(s5);

    }
}
