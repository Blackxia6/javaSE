package 二维数组;

/**
 * @date 2022/9/9 - 16:10
 */
public class 二维数组的遍历 {
    public static void main(String[] args) {
        String[][] str = {{"java","oracle","c++","c#"},{"张三","李四","王五"},{"lucy","jack"},{"1","2"},{"over"}};
        for (int i = 0; i <str.length ; i++) {
            for (int j=0;j<str[i].length;j++){
                System.out.print(str[i][j]+" ");
            }
            System.out.println();//换行
        }
        int[][] arr = new int[3][4];//动态初始化二维数组
        for (int i = 0; i <arr.length ; i++) {
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("=============================");
        int[][] c = {//静态初始化二维数组
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10}
        };
        printArray(c);
    }
    public static void printArray(int[][] arr){//遍历int类型的二维数组的方法
        for (int i = 0; i <arr.length ; i++) {
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
