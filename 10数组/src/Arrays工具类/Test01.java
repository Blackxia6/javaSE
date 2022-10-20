package Arrays工具类;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

/**
 * @date 2022/9/11 - 15:45
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1,5,4,6,5,3,10,9};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("===============================");
        int[] a = Arrays.copyOf(arr,2);//从下标为0开始截
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
    }
}
