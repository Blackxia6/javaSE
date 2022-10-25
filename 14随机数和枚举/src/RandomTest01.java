import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @date 2022/9/18 - 15:21
 */
public class RandomTest01 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        Random r1 = new Random();
        int num1 = r1.nextInt();//产生一个int类型的随机数
        System.out.println(num1);

        int num2 = r1.nextInt(11);//产生0-10的随机数
        System.out.println(num2);
        long end = System.currentTimeMillis();
        System.out.println("运行花费的时间"+(end-begin)+"毫秒");
        for (int i = 0; i <100 ; i++) {
            double n = r1.nextDouble()*11;
            int a = (int)(n);
            System.out.println(a);
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String s = sdf.format(begin);
        String s1 = sdf.format(end);
        System.out.println(s);
        System.out.println(s1);


    }
}
