package 标准输出流;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @date 2022/10/3 - 21:08
 */
public class PrintWriterTest01 {
    public static void main(String[] args) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("logTest");

            printWriter.println("飞雪连天射白鹿");
            printWriter.flush();//刷新
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if ( printWriter== null) {
                printWriter.close();
            }
        }
    }
}
