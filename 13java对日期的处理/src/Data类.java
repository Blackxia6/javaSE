import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2022/9/17 - 9:57
 */
public class Data类 {
    public static void main(String[] args) throws ParseException {//抛异常
        //获取系统当前时间(精确到毫秒)
        Date nowTime = new Date();
        System.out.println(nowTime);

        //日期格式化
        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTimestr = simpleDateFormat.format(nowTime);
        System.out.println("当前时间:"+nowTimestr);

        //如何将日期字符串转换为Date类型
        String time = "2008-08-08 08:08:08 888";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime =simpleDateFormat1.parse(time);
        System.out.println(dateTime);
    }

}
