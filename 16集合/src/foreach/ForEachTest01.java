package foreach;

/**
 * @date 2022/9/25 - 21:20
 */
public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr = {100,44,55,57,5,10};
        //遍历数组(普通for循环)
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("使用增强for循环的循环");
        //增强for循环（foreach）
//        for(元素类型 变量名 : 数组或集合){
//            System.out.println(变量名);
//        }
        for (int i : arr){
            System.out.println(i);
        }
    }
}
