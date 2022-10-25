package 枚举;

/**
 * @date 2022/9/19 - 9:09
 */
//采用枚举的方式改造程序EnumTest01
public class EnumTest02 {
    public static void main(String[] args) {
        Result r = divide(10,0);
        System.out.println(r == Result.SUCCESS ?"计算成功":"计算失败");
         System.out.println(c.COUNTRY);
    }

    public static Result divide(int a,int b){
        try {
            int c = a/b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }
}

//枚举一枚一枚可以列举出来的，才建议使用，枚举类型
//枚举也是一种引用数据类型
//枚举中的每一个值可以看成常量
enum Result{
    //枚举编译后也是生成class文件
    SUCCESS,FAIL
}

abstract class a{
    public a(){};
    public abstract void b();
}
interface c{
    public static final String COUNTRY="中国";
}