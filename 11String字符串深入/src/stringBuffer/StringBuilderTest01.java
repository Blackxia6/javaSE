package stringBuffer;

/**
 * @date 2022/9/15 - 21:59
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        //创建一个初始化容量为16的byte数组，（字符串缓冲区）
        StringBuilder sb = new StringBuilder();
        sb.append(100);
        sb.append("hello");
        System.out.println(sb);
    }
}
