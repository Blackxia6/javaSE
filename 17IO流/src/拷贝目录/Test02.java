package 拷贝目录;

import java.io.*;

/**
 * @date 2022/10/4 - 13:17
 */
public class Test02 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\夏文建\\Desktop\\同上一堂思政课观后感\\c语言");
        if (!(f1.exists())){
            f1.mkdir();
        }
        File f2 = new File("D:\\c语言");
        File[] files = f2.listFiles();
        for (File file : files){
            String filePath = file.getAbsolutePath();
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(filePath);
                fos = new FileOutputStream("C:\\Users\\夏文建\\Desktop\\同上一堂思政课观后感\\c语言\\"+file.getName());
                byte[] bytes = new byte[1024*1024];
                int count = 0;
                while ((count = fis.read(bytes)) != -1){
                    fos.write(bytes,0,count);
                }

                fos.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
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
}
