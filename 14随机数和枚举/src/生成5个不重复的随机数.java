import java.util.Arrays;
import java.util.Random;

/**
 * @date 2022/9/18 - 15:28
 */
public class 生成5个不重复的随机数 {
    public static void main(String[] args) {
        Random r1 = new Random();
        int[] b = new int[5];
        for (int i = 0; i <b.length ; i++) {
            b[i]=-1;
        }

        int index = 0;
        while (index<b.length){
            int num = r1.nextInt(11);
           // System.out.println("生成的随机数:"+num);
            if (!contains(b,num)){
                b[index++]=num;

                //index++;
            }

        }
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }
    }

    //单独编写一个方法，这个方法专门用来判断数组中是否包含某个元素

    /**
     *
     * @param b 数组
     * @param key 元素
     * @return true表示包含 FALSE表示不包含
     */
    public static boolean contains(int[] b,int key){
        for (int i = 0; i <b.length ; i++) {
            if (b[i] == key){
                return true;
            }
        }
        return false;
    }
}
