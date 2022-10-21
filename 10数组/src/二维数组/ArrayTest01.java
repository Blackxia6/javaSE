package 二维数组;

/**
 * @date 2022/9/9 - 15:38
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        //二维数组
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {0}
        };
        int[][] b ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(b.length);
        System.out.println(a[3][0]);
        System.out.println("==================");
        for (int i = 0; i <a.length ; i++) {
            for (int j =0 ;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
