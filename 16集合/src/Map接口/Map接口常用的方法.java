package Map接口;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @date 2022/9/26 - 9:03
 */
public class Map接口常用的方法 {
    public static void main(String[] args) {
        //创建map集合对象
        Map<Integer,String> map = new HashMap<>();
        //向map集合中添加键值对
        map.put(new Integer(1),"zhangsang");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");
        //通过key获取value
       String value1 =  map.get(1);
        System.out.println(value1);
        //获取键值对的数量
        System.out.println("键值对的数量:"+map.size());
        //通过key删除value
        map.remove(1);
        System.out.println("键值对的数量:"+map.size());
        //判断是否包含某个key
        System.out.println(map.containsKey(1));
        //判断是否包含某个value
        System.out.println(map.containsValue("zhaoliu"));
        System.out.println("=======================");
        //获取map集合中所有的values
        Collection<String> c1 = map.values();
        Iterator<String> it = c1.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
//        for (String s : c1){
//            System.out.println(s);
//        }

        System.out.println("==========================");
        //清空map集合
        map.clear();
        System.out.println("清空后集合中键值对的数量:"+map.size());
        //判断map集合是否为空
        System.out.println("集合是否为空:"+map.isEmpty());

    }
}
