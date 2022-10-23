/**
 * @date 2022/9/16 - 17:10
 */
public class Integer类里常用方法 {
    public static void main(String[] args) {
        Integer x = new Integer(100);//手动装箱
        int y = x.intValue();//手动拆箱
        Integer z = new Integer("1");
        System.out.println(z);
        System.out.println("=================");


        //static int parseInt(String s)  将字符串参数作为有符号的十进制整数进行解析。
        int reValue = Integer.parseInt("123");//将字符串转换为int类型的数字
        float f = Float.parseFloat("1.0");
        System.out.println(f);
        System.out.println(reValue);
        //------------------------------------------------
        String binaryString = Integer.toBinaryString(Integer.MAX_VALUE);//将十进制转换为二进制
        System.out.println(binaryString);

        //将十进制转换为十六进制
        String heString = Integer.toHexString(16);
        System.out.println(heString);

        //将十进制转换为八进制
        String octalString = Integer.toOctalString(8);
        System.out.println(octalString);

        System.out.println(new Object());

        //字符串转Integer
        Integer i = Integer.valueOf("100");
        System.out.println("我是Integer类型的"+i);

        //int转字符串
        String s1 = String.valueOf(100);
        System.out.println("我是string类型的"+s1);
        
    }
}
