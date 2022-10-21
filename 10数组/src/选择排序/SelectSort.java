package 选择排序;
/*
 选择排序:
      每一次从这堆'参与'比较的数据当中找出最小值，
      拿着这个最小值和参与比较的最前面的元素进行交换位置
      选择排序比冒泡排序的优点:每一次的交换都是有意义的
* */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3,1,6,2,5};

        //5条数据循环4次
        for (int i = 0; i <arr.length-1 ; i++) {
            int min = i;
            for (int j =i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            if (min != i){
                //表示存在更小的数据
                int temp;
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
