package Map接口;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @date 2022/9/26 - 17:08
 */
public class Test01 {
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<>();
        map.put(1,"hello");
        map.put(2,"world");
        map.put(3,"xwj");
        map.put(4,"win");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys){
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("========================");
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("-----------------------");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> s : set){//foreach
            Integer key = s.getKey();
            String value = s.getValue();
            System.out.println(key+"="+value);
        }
        //使用迭代器
        System.out.println("+++++++++++++++++++++++++++++");
        Iterator<Map.Entry<Integer,String>> it2 = set.iterator();
        while (it2.hasNext()){
           Map.Entry<Integer, String> node = it2.next();
           Integer key = node.getKey();
           String value = map.get(key);
            System.out.println(key+"="+value);

        }
    }
}
