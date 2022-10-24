/**
 * @date 2022/9/17 - 10:27
 */
public class 获取某段时间的总毫秒数 {
    public static void main(String[] args) {
        long nowTimeMillis = System.currentTimeMillis();//从1970年1月1日凌晨开始到现在的总毫秒数
        System.out.println(nowTimeMillis);

        //统计一个方法执行消耗的时间
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("执行print()方法耗费的时间为"+(end-begin)+"毫秒");
    }
    public  static void print(){
        for (int i = 0;i<1000000000;i++){
            System.out.println("i="+i);
        }
    }
}
