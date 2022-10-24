import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2022/9/18 - 14:58
 */
public class 通过毫秒构造Date对象 {
    public static void main(String[] args) {
        //1970-01-01 00:00:00 001
        Date time = new Date(1);//参数是一个毫秒数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String timeStr = sdf.format(time);
        System.out.println(timeStr);//1970-01-01 08:00:00 001

        //获取昨天此时的时间
        Date time2 = new Date(System.currentTimeMillis()-1000*60*60*24);
        String timeStr2 = sdf.format(time2);
        System.out.println(timeStr2);


    }
}
