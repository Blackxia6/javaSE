package Arrays工具类;

/**
 * @date 2022/9/11 - 16:02
 */
/*
  冒泡排序
    3 2 7 6 8
    拿着3和相邻的2进行比较，若果左边>右边，交换位置
    2 3 7 6 8
    3又和7进行比较
 * */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] array = {5,1,2,9,7,10,21,11};
        //通过冒泡排序算法对以上数组中的元素进行排序
        //冒泡排序的核心是什么--->拿着左边的数字和右边的数字对比，当左边>右边 交换位置
        int count = 0;
        for (int i = array.length-1; i >0 ; i--) {
           for (int j = 0;j<i;j++){
               count++;
               if (array[j] > array[j+1]){
                   //交换位置
                   int a =0;
                   a = array[j];
                   array[j] = array[j+1];
                   array[j+1]=a;
               }
           }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();
        System.out.print("比较次数:"+count);

    }
}
