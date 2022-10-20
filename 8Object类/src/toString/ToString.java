package toString;

import java.util.Scanner;

/**
 * @date 2022/9/6 - 20:20
 */
public class ToString {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(1970, 8, 8);
        String s1 = myTime.toString();
        //MyTIme重写toSting方法之前
        System.out.println(s1);//toString.MyTime@b4c966a
        System.out.println(myTime);
        String s = "11";
        Scanner scanner = new Scanner(System.in);

        String t = scanner.next();

        System.out.println(s.equals(t));
    }

}

class MyTime {
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //重写toString方法

    @Override
    public String toString() {
        return this.year + "年" + this.month + "月" + this.day + "日";
    }
}
