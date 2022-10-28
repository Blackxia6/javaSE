package 拷贝目录;

import java.io.*;

/**
 * @date 2022/10/4 - 15:19
 * 这是最终版
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        //源文件夹
        File srcDir = new File("D:\\c语言");
        //目标文件夹
        File targetDir = new File("C:\\Users\\夏文建\\Desktop\\同上一堂思政课观后感\\");
        copyDirs(srcDir,targetDir);
    }

    /**
     * 拷贝文件
     * @param srcFile 源文件路径
     * @param targetFile 目标文件按路径
     */
    public static void copyFile(File srcFile, File targetFile) throws IOException {
        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(targetFile);
        byte[] bytes = new byte[1024 * 1024];
        int length = -1;
        while ((length = in.read(bytes)) != -1) {
            out.write(bytes, 0, length);
        }
        out.flush();
        out.close();
        in.close();
    }

    /**
     * 拷贝文件夹
     * @param srcDir 源文件夹路径
     * @param targetDir 目标文件夹路径
     */
    public static void copyDirs(File srcDir, File targetDir) throws IOException {
        if (srcDir != null && targetDir != null) {
            if (srcDir.isDirectory()) {
                //拷贝文件夹
                targetDir = new File(targetDir, srcDir.getName());
                boolean b = false;
                if (!targetDir.exists()){
                    b = targetDir.mkdirs();//生成最外层的目录
                }

                System.out.println("拷贝文件夹" + srcDir + "\t到\t" + targetDir+"\t" + b);
                //拷贝文件
                String[] list = srcDir.list();
                if (list != null && list.length > 0) {
                    for (String s : list) {
                        //源文件
                        File srcFile = new File(srcDir, s);
                        File targetFile = new File(targetDir, s);
                        if (srcFile.isDirectory()) {
                            //递归调用
                            copyDirs(srcFile, targetDir);
                        }else{
                            //生成文件
                            targetFile.createNewFile();
                            //开始拷贝
                            copyFile(srcFile, targetFile);
                        }
                    }
                }
            }
        }
    }

}
