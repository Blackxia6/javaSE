package 二分法查找数组元素;

import java.util.Scanner;

/**
 * @date 2022/9/12 - 22:06
 */
public class ArraySerch {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 8, 4, 10, 79, 8};
        Scanner scanner = new Scanner(System.in);
        //找到87的下标如果没有返回-1
//        while (true){
//            System.out.print("输入你要找到元素:");
//            int a = scanner.nextInt();
//            for (int i = 0; i <arr1.length ; i++) {
//                if (arr1[i]==a){
//                    System.out.println(arr1[i]+"下标是:"+i);
//                    return;
//                }
//            }
//            System.out.println(a+"不存在");
//        }
        System.out.print("请输入你要查找的元素:");
        int b = scanner.nextInt();
        int index = arraySerch(arr1, b);
        System.out.println(index == -1 ? "该元素不存在" : "该元素的下标为:" + index);

    }

    public static int arraySerch(int[] arr1, int num) {//静态方法
        for (int i = 0; i < arr1.length; i++) {
            if (num == arr1[i]) {
                return i;
            }
        }
        return -1;
    }
}
