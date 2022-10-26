package finally子句;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/9/20 - 21:04
 */
public class Test01 {
    public static void main(String[] args) {
        FileInputStream fis =null;
        try {

             fis = new FileInputStream("新建文本文档 (2).txt");
             String s = null;
             s.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("hekko");
            try {
                if (fis != null){
                    fis.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("heloo");
        }
    }
}
