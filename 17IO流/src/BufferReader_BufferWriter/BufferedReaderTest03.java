package BufferReader_BufferWriter;

import java.io.*;

/**
 * @date 2022/10/2 - 23:42
 */
public class BufferedReaderTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        BufferedReader br = null;
        InputStreamReader inr = null;
        try {
            fis = new FileInputStream("Copy02.java");
            inr = new InputStreamReader(fis);//将字节流转换成字符流
            br = new BufferedReader(inr);
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
