package File类;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2022/10/3 - 22:02
 */
public class FileTest02 {
    public static void main(String[] args) {
        //获取文件名
        File f1 = new File("copy");
        System.out.println("文件名"+f1.getName());
        //判断是文件还是目录
        System.out.println(f1.isDirectory());//判断是否是目录
        System.out.println(f1.isFile());//判断是否为文件
        //获取文件最后一次修改文件
        long time = f1.lastModified();//这是一个毫秒数，要转换
        Date lastTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println("copy文件的最后修改时间:"+strTime);
        //获取文件大小
        System.out.println("copy文件的大小："+f1.length());//28字节

    }
}
