package collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @date 2022/9/24 - 15:13
 */
public class Iterator的remove方法 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        Iterator it = c.iterator();//创建一个迭代器
        while (it.hasNext()){
            System.out.println(it.next());
            it.remove();//迭代器的remove方法
        }
        System.out.println(c.size());
    }
}
