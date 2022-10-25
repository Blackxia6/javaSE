package 枚举;

import java.util.Arrays;

/**
 * @date 2022/9/19 - 8:53
 */
public class EnumTest01 {
    public static void main(String[] args) {
        int reValue = divide(10,2);
        System.out.println(reValue == 1 ? "计算成功":"计算失败");//1

        int reValue2 = divide(10,0);
        System.out.println(reValue2 == 0?"计算失败":"计算成功");//0

    }

    /**
     * 以下程序计算两个int类型的商，计算成功返回1 计算失败返回0
     * @param a
     * @param b
     */
    public static int divide(int a , int b){
        try {
            int c = a/b;
            //程序执行到这里表示上面的代码没有异常，表示执行成功
            return 1;
        }catch (Exception e){
            //程序执行到这里表示上面的代码有异常，表示执行失败
            return 0;
        }

    }
}
