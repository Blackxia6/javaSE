package 二分法查找数组元素;

import java.util.Scanner;

/**
 * @date 2022/9/12 - 22:24
 */
public class 二分法查找 {//适用于排序好的数组

    public static void main(String[] args) {
        int[] arr2 = {5, 9, 11, 100, 110};
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要查找到元素:");
        int a = scanner.nextInt();
        int index = binarySerch1(arr2, a);
        System.out.println(index == -1 ? "元素不存在" : a + "的下标为:" + index);

    }

    /**
     * 从数组中查找目标元素的下标
     *
     * @param arr2 被查找的数组
     * @param num  被查的元素
     * @return -1表示该元素不存在 ，其他返回下标
     */
    public static int binarySerch1(int[] arr2, int num) {
        int begin = 0;//开始下标
        int end = arr2.length - 1;//结束下标
        int middle = (begin + end) / 2;//中间下标
        while (begin <= end) {
            if (arr2[middle] == num) {
                return middle;
            } else if (arr2[middle] < num) {
                begin = middle + 1;
                middle = (end + begin) / 2;
                if (middle == num) {
                    return middle;
                }
            } else {
                end = middle - 1;
                middle = (begin + end) / 2;
                if (arr2[middle] == num) {
                    return middle;
                }
            }
        }


        return -1;
    }
}
