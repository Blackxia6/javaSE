package 拷贝目录;

import java.io.*;

/**
 * @date 2022/10/4 - 13:41
 */
public class Test03 {
    public static void main(String[] args) {
        File srcFile = new File("D:\\c语言");//拷贝源
        File desFile = new File("C:\\Users\\夏文建\\Desktop\\同上一堂思政课观后感\\");//拷贝目标
        copyDir(srcFile,desFile);
    }

    /**
     *
     * @param srcFile 拷贝源
     * @param desFile 拷贝目标
     */
    private static void copyDir(File srcFile, File desFile) {
        if(srcFile.isFile()){//如果srcFile是一个文件就没必要递归
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(srcFile);
                String path = (desFile.getAbsolutePath().endsWith("\\") ? desFile.getAbsolutePath() : desFile.getAbsolutePath()+"\\")+srcFile.getAbsolutePath().substring(3);
                fos = new FileOutputStream(path);
                //一边读一边写
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

            return;
        }
        //现获取源下面的子目录
        File[] files = srcFile.listFiles();

        for (File file : files){
            //这个file可能是文件，也可能是目录
            //System.out.println(file.getAbsolutePath());
            if (file.isDirectory()){
                //System.out.println(file.getAbsolutePath());
                String srcDir = file.getAbsolutePath();
                String destDir =(desFile.getAbsolutePath().endsWith("\\") ? desFile.getAbsolutePath() : desFile.getAbsolutePath()+"\\")+srcDir.substring(3);
                File newFile = new File(destDir);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }

            copyDir(file,desFile);//递归调用
        }
    }
}
