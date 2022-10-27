package Map接口;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @date 2022/9/26 - 16:11
 */
public class Map集合的遍历 {
    public static void main(String[] args) {
        //第一种方式：获取所有的key，通过遍历key来遍历value
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhngsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");
        //遍历map集合
        Set<Integer> keys = map.keySet();//获取map集合中所有的key
        //遍历key
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }

        System.out.println("=================");
        for (Integer key : keys){
            System.out.println(key+"="+map.get(key));
        }



    }
}
