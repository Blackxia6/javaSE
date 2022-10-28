package BufferReader_BufferWriter;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @date 2022/10/2 - 23:16
 * BufferedReader:
 *   带有缓冲区的字符输入流
 *   使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组，自带缓冲
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{
        //当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做节点流，外部负责包装的流叫做包装流/处理流
        FileReader fir = new FileReader("Copy02.java");//节点流
        BufferedReader br = new BufferedReader(fir);//包装流/处理流
        //读第一行
        String firstLine = br.readLine();
        System.out.println("第一行:"+firstLine);

        //读第二行
        String secondLine = br.readLine();
        System.out.println("第二行:"+secondLine);

        //读第三行
        String thirdLine = br.readLine();
        System.out.println("第三行:"+thirdLine);

        //关闭流只需关闭最外层的流即可
        br.close();
    }
}
