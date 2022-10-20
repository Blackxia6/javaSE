package equals方法;

import java.util.Objects;

/**
 * @date 2022/9/6 - 20:33
 * 1
 */
public class Equals01 {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        //判断两个基本数据类型是否相等用“==”就可以判断了
        System.out.println(a == b);
        //判断两个java属性是否相等
        MyTime myTime1 = new MyTime(2008, 8, 8);
        MyTime myTime2 = new MyTime(2008, 8, 8);
        //判断两个对象是否相等不能直接调用equals方法，重写equals方法
        System.out.println(myTime1.equals(myTime2));
        MyTime myTime3 = new MyTime(1970, 8, 8);
        System.out.println(myTime1.equals(myTime3));//日期不等false

        MyTime myTime4 = null;
        System.out.println(myTime1.equals(myTime4));
        String s1 = new String("text");
        String s2 = new String("text");
        System.out.println(s1.equals(s2));
        System.out.println(s1.toString());
    }
}

class MyTime extends Object {
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
    //重写equals方法


//    @Override
//    public boolean equals(Object obj) {//重写equals方法
//        /*
//        int year1 = this.year;
//        int month1 = this.month;
//        int day1 = this.day;
//        if (obj instanceof MyTime){
//            MyTime t = (MyTime)obj;
//            int year2 = t.year;
//            int month2 = t.month;
//            int day2 = t.day;
//            if (year1 == year2 && day1 == day2 && month1 == month2){
//                return true;
//            }
//        }
//
//        return false;
//
//         */
//        //改良equals方法
//        if(obj == null || !(obj instanceof MyTime)){
//            return false;
//        }
//        if (this == obj){
//            return true;
//        }
//        MyTime t = (MyTime)obj;
//        if (this.year == t.year && this.month == t.month && this.day == t.day){
//            return true;
//        }
//        return false;
//        //return this.year == t.year && this.month == t.month && this.day == t.day
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof MyTime)) return false;
        MyTime myTime = (MyTime) o;
        return this.year == myTime.year &&
                this.month == myTime.month &&
                this.day == myTime.day;
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

