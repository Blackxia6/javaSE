package 二维数组;

/**
 * @date 2022/9/9 - 15:54
 */
public class 二维数组元素的取和改 {
    public static void main(String[] args) {
        int[][] a = {{34,2},{52,89,87},{0},{11,40,100}};
        //取出a数组中的第一个一维数组
        for (int i = 0; i <a[0].length ; i++) {
            System.out.println(a[0][i]);
        }
        System.out.println("===================");
        int[] a2 = a[0];
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }
        System.out.println("=================");
        int b = a[0][0];
        a[0][0]=100;//改数组元素的值
        System.out.println(a[0][0]);
    }
}
