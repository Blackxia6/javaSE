package BufferReader_BufferWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @date 2022/10/2 - 23:33
 */
public class BufferedReaderTest02 {
    public static void main(String[] args) {
        FileReader fir = null;//节点流
        BufferedReader br = null;//包装流/处理流
        try {
            fir = new FileReader("Copy02.java");
             br = new BufferedReader(fir);//包装流/处理流
            String s = "a";
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br != null) {
                //对于包装流来说只需关闭最外层的流即可
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
