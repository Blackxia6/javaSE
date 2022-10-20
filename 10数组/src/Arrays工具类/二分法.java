package Arrays工具类;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @date 2022/9/12 - 23:02
 */
public class 二分法 {//java类库自带的二分法查找元素(仅仅适用于已经排好序的数组)
    public static void main(String[] args) {
        int[] arr3 = {4,5,8,10,11};
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要查找的元素:");
        int a = scanner.nextInt();
        int index = Arrays.binarySearch(arr3,a);
        System.out.println(index == -1 ? "元素不存在" : a+"元素下标为:"+index);
    }
}
