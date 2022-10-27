package HashMap集合.bean;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @date 2022/10/20 - 10:31
 */
public class Test01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"xwj");
        map.put(2,"hjj");
        map.put(4,"吴天子");
        map.put(3,"朱祺");
        map.put(0,"lyg");

        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> node = it.next();
            System.out.println(node.getKey()+"="+node.getValue());
        }
        System.out.println("=================");
        for (Map.Entry<Integer,String> node : set){
            System.out.println(node.getKey()+"="+node.getValue());
        }

    }
}
