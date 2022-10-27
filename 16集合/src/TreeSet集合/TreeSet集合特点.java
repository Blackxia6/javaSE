package TreeSet集合;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @date 2022/9/26 - 8:57
 * 无序不可重复
 * TreeSet集合
 */
public class TreeSet集合特点 {//无序不可重复
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("Z");
        treeSet.add("Y");
        treeSet.add("Z");
        treeSet.add("K");
        treeSet.add("M");
        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (String s : treeSet){
            System.out.println(s);
        }


    }
}
