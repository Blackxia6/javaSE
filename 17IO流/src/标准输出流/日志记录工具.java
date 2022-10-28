package 标准输出流;

import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2022/10/3 - 20:15
 */
public class 日志记录工具 {
    public static void log(String Message){
        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("logTest01",true));
            System.setOut(printStream);//改变输出流的方向
            Date date = new Date();
            //日期格式化
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
            String nowTime = sdf.format(date);
            System.out.println(nowTime+":"+Message);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
