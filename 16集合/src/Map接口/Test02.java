package Map接口;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @date 2022/9/26 - 18:43
 */
public class Test02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"ss");
        map.put(2,"dd");
        map.put(3,"ff");
        Set<Integer> set = map.keySet();
//        for (Integer key : set){
//            System.out.println(key+"="+map.get(key));
//        }
        /*Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }*/
        Set<Map.Entry<Integer,String>> set1 = map.entrySet();
//        for(Map.Entry<Integer,String> node : set1){
//            Integer key = node.getKey();
//            String value = node.getValue();
//            System.out.println(key+"="+value);
//        }
        Iterator<Map.Entry<Integer,String>> iterator =set1.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> node = iterator.next();
            String value = node.getValue();
            Integer key = node.getKey();
            System.out.println(key+"="+value);

        }
    }



}
