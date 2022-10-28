package 拷贝目录;

import java.io.*;

/**
 * @date 2022/10/3 - 22:38
 */
public class Test01 {
    public static void main(String[] args) {
        File f = new File("D:\\自学的文件\\老杜-javaSE\\java进阶\\文件");
        File f1 = new File("C:\\Users\\夏文建\\Desktop\\同上一堂思政课观后感\\文件");
        if (!f1.exists()){
            f1.mkdir();//如果文件不存在，这将以文件夹的形式创建出来
        }
        File[] files = f.listFiles();
        for (File file : files){
            String name = file.getAbsolutePath();//被复制文件的路径
            FileInputStream fis =null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(file);
                fos = new FileOutputStream("C:\\Users\\夏文建\\Desktop\\同上一堂思政课观后感\\文件\\"+file.getName());
                byte[] bytes = new byte[1024*1024];
                int coutn = 0;
                while ((coutn = fis.read(bytes)) != -1){
                    fos.write(bytes,0,coutn);
                }


                fos.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
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
