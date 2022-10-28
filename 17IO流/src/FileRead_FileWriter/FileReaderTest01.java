package FileRead_FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @date 2022/10/2 - 22:14
 * FileReader:
 *   文件字符输入流，只能读取普通文本文件
 *   读取文本内容时，比较方便，快捷
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fir = null;
        try {
            fir = new FileReader("17IO流/src/FileInputStream/temp");

            char[] chars = new char[4];
            int count = 0;
            while ((count = fir.read(chars)) != -1){
                System.out.print(new String(chars,0,count));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fir != null) {
                try {
                    fir.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
