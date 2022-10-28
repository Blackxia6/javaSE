package File类;

import java.io.File;

/**
 * @date 2022/10/3 - 22:28
 */
public class FileTest03 {
    public static void main(String[] args) {
        //获取当前目录下所有的子文件
        File f = new File("D:\\study\\老杜-javaSE\\java进阶\\文件");
        File[] files = f.listFiles();

        for (File fs : files){
//            System.out.println("aa"+fs.getParent());
//            System.out.println(fs.getName());//获取文件名
            System.out.println(fs.getAbsolutePath());
        }
    }
}
