package LinkList源码;

import java.util.LinkedList;
import java.util.List;

/**
 * @date 2022/9/25 - 14:27
 */
public class LinkListTest01 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(100);
        list.add(10);
        list.add(50);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
