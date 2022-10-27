package Vector集合;

import java.util.Iterator;
import java.util.Vector;

/**
 * @date 2022/9/25 - 17:37
 * Vector底层也是一个数组
 * 初始化容量:10
 * 扩容之后是原容量的两倍 10--->20---->40
 */
public class VectorTest01 {
    public static void main(String[] args) {
        //创建一个vector集合
        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);

        //扩容
        vector.add(11);
        System.out.println("元素个数:"+vector.size());
        vector.set(1,"hello");//指定位置改元素
        vector.remove(1);//删除指定位置的元素
        Iterator it = vector.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
