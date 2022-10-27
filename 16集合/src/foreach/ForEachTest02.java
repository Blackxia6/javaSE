package foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @date 2022/9/25 - 21:26
 * 集合使用foreach
 */
public class ForEachTest02 {
    public static void main(String[] args) {
        //不使用foreach
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("kitty");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //集合使用foreach
        System.out.println("=====使用foreach=====");
        for (String s : list){
            System.out.println(s);
        }
    }
}
