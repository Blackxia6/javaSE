package ArrayList集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @date 2022/9/25 - 9:14
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        List list1 = new ArrayList();//没写初始化为10
        List list2 = new ArrayList(20);//初始化容量为20


        Collection c = new HashSet();
        c.add(100);
        c.add(1);
        c.add("hello");
        //通过这个构造方法就可以将HashSet集合转换成List集合
        List list3 = new ArrayList(c);
        for (int i = 0; i <list3.size() ; i++) {
            System.out.println(list3.get(i));
        }


    }
}
