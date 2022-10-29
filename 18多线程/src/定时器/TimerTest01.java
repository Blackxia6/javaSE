package 定时器;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @date 2022/10/9 - 17:32
 * 使用定时器定时指定任务
 */
public class TimerTest01 {
    public static void main(String[] args) {
        //创建定时器对象
        Timer timer = new Timer();
        Timer timer1 = new Timer(true);//守护线程的方式

        //获取时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = null;
        try {
            firstTime = sdf.parse("2022-10-9 17:51:50");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //指定定时任务
       // timer.schedule(定时任务，第一次执行时间，间隔多久执行一次);
        LogTimerTask ltt = new LogTimerTask();
        timer1.schedule(ltt,firstTime,10000);
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//定时任务类
class LogTimerTask extends TimerTask{

    @Override
    public void run() {
        //编写你需要执行的任务就可以了
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());//获取当前时间
        System.out.println(strTime+":完成一次数据备份");
    }
}