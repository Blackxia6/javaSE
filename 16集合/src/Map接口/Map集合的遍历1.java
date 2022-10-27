package Map接口;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @date 2022/9/26 - 16:31
 */
public class Map集合的遍历1 {
    public static void main(String[] args) {
        //遍历map集合的第二种方式
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhngsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");
        //把map集合直接全部转换成set集合，set集合中元素类型是Map.Entry
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        //遍历set集合
        //迭代器
        Iterator<Map.Entry<Integer,String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> node = it.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("=====================");
        for (Map.Entry<Integer,String> node1 : set){
            System.out.println(node1.getKey()+"="+node1.getValue());
        }
    }
}
