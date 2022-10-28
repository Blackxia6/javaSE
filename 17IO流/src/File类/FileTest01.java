package File类;

import java.io.File;
import java.io.IOException;

/**
 * @date 2022/10/3 - 21:32
 * 去D盘看
 */
public class FileTest01 {
    public static void main(String[] args) {
        File f1 = new File("D:\\A");
        //判断文件是否存在
        System.out.println(f1.exists());
        /*if (!f1.exists()){
            try {
                f1.createNewFile();//如果文件不存在，将以文件的形式创建出来
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        if (!f1.exists()){
            //f1.mkdir();//如果文件不存在，这将以文件夹的形式创建出来
            System.out.println("文件夹不存在");
        }
        File f2 = new File("D:\\Baidu\\controllerProfiles\\vJoyDevice_GamePad.txt");
        //获取父文件路径
        String parentPath = f2.getParent();
        System.out.println("vJoyDevice_GamePad.txt 父文件路径为:"+parentPath);

        File parentFile = f2.getParentFile();
        System.out.println("绝对路径:"+parentFile.getAbsolutePath());
        System.out.println(parentFile);

        File f3 = new File("copy");
        String path = f3.getParent();
        System.out.println("copy文件的绝对路径"+f3.getAbsolutePath());//D:\IDEA\javase\copy

    }
}
