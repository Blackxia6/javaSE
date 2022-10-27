package List接口特有的方法;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/9/24 - 21:41
 */
public class ListTest01 {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("A");//添加元素 0
        myList.add("B");//添加元素 1
        myList.add("C");//添加元素 2
        for (int i = 0; i <myList.size() ; i++) {//用下标遍历集合
            System.out.println("第["+(i)+"]个元素:"+myList.get(i));

        }
        System.out.println("================在指定位置上添加元素（E）之后的遍历结果=====================");
        //在指定位置添加元素
        myList.add(1,"E");//在下标为1的位置上添加E
        for (int i = 0; i <myList.size() ; i++) {//用下标遍历集合
            System.out.println("第["+(i)+"]个元素:"+myList.get(i));

        }
        System.out.println("================在指定位置上删除元素(E)之后的遍历结果=====================");
        myList.remove(1);//在指定位置删除元素
        for (int i = 0; i <myList.size() ; i++) {//用下标遍历集合
            System.out.println("第["+(i)+"]个元素:"+myList.get(i));
        }
        System.out.println("================修改指定位置上添加元素之后的遍历结果=====================");
        myList.set(1,"J");//修改指定位置上的元素
        for (int i = 0; i <myList.size() ; i++) {//用下标遍历集合
            System.out.println("第["+(i)+"]个元素:"+myList.get(i));
        }
        System.out.println("================================================================");
        myList.add("A");
        for (int i = 0; i <myList.size() ; i++) {
            System.out.println("第["+i+"]个元素:"+myList.get(i));
        }
        System.out.println("A元素第一次出现的位置-->"+myList.indexOf("A"));//第一次出现的位置
        System.out.println("A元素最后出现的位置-->"+myList.lastIndexOf("A"));//最后出现的位置
    }
}
