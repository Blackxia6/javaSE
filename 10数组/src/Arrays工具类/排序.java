package Arrays工具类;

import java.util.Arrays;

/**
 * @date 2022/9/12 - 23:36
 */
public class 排序 {
    public static void main(String[] args) {
        int[] arr4 = {1,5,4,2,9,8,11,88,44,55,77};
        Arrays.sort(arr4);//排序
        for (int i = 0; i <arr4.length ; i++) {
            System.out.print(arr4[i]+"   ");
        }
        System.out.println();
        //二分法查找
       int index =  Arrays.binarySearch(arr4,5);
        System.out.println(index == -1 ? "元素不存在" : "元素下标为:"+index);
    }
}
