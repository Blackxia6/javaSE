package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/10/2 - 21:03
 */
public class Test01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("17IO流/src/FileInputStream/temp");
            byte[] b1 = new byte[4];
            int count = 0;
            while ((count = fis.read(b1)) != -1){
                String s1 = new String(b1,0,count);
                System.out.print(s1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
