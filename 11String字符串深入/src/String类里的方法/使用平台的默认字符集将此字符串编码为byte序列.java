package String类里的方法;

/**
 * @date 2022/9/15 - 17:13
 */
public class 使用平台的默认字符集将此字符串编码为byte序列 {
    public static void main(String[] args) {
       // byte[] getBytes() 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        byte[] bytes = "abcdef".getBytes();
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]);
        }

       // byte[] getBytes(Charset charset) 使用给定的 charset 将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组。

    }
}
