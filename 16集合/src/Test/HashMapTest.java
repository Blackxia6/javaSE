package Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @date 2022/9/29 - 20:04
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"ss");
        map.put(22,"ll");
        map.put(2,"sf");

        System.out.println(map.get(2));

        Set<Integer> set = map.keySet();
        for (Integer i : set){
            System.out.println(i+"="+map.get(i));
        }
        System.out.println("======================");
        Set<Map.Entry<Integer,String>> set1 = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it = set1.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> node = it.next();
            System.out.println(node.getKey()+"="+node.getValue());
        }
        System.out.println("=====================");
        for (Map.Entry<Integer,String> node : set1){
            System.out.println(node.getKey()+"="+node.getValue());
        }

    }
}
