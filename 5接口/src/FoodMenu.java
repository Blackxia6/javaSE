/**
 * @date 2022/9/5 - 9:17
 */

public interface FoodMenu{
    public abstract void 西红柿炒鸡蛋();//西红柿炒鸡蛋
    public abstract void 牛排();//牛排
    public static final String COUNTRY="中国";
     public static final int a = 1;
//ssssss
}
class M{
    int a =1;
    static int o = 3;
}
class H{
    public static void main(String[] args) {
        M m = new M();

        System.out.println(m.a);
        m.a=2;
        System.out.println(m.a);
        int v=3;
        v=5;
        System.out.println(v);
        System.out.println(M.o);
    }
}