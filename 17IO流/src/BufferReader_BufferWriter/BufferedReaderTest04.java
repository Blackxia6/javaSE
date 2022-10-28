package BufferReader_BufferWriter;

import java.io.*;

/**
 * @date 2022/10/2 - 23:54
 */
public class BufferedReaderTest04 {
    public static void main(String[] args) {
        BufferedReader br = null;//包装流/处理流
        try {
             br = new BufferedReader(new InputStreamReader(new FileInputStream("Copy02.java")));
             String line = null;
             while ((line = br.readLine()) != null){
                 System.out.println(line);
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
