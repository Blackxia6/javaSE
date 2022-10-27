package Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @date 2022/9/29 - 19:47
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("2");
        System.out.println(list.get(0));

        for (String s : list){
            System.out.println(s);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
