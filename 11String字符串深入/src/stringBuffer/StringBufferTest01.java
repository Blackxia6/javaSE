package stringBuffer;

/**
 * @date 2022/9/15 - 21:31
 * 字符串拼接新方法
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        //创建一个初始化容量为16的byte数组，（字符串缓冲区）
        StringBuffer stringBuffer = new StringBuffer();
        //以后拼接字符串统一调用 append()方法
        stringBuffer.append("a");
        stringBuffer.append("b");


        System.out.println(stringBuffer);

        StringBuffer stringBuffer1 = new StringBuffer(100);//指定初始化容量为100
        stringBuffer1.append("hello");
        stringBuffer1.append(" world");
        System.out.println(stringBuffer1);
    }
}
