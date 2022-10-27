package HashMap集合;

import java.util.HashMap;
import java.util.Map;

/**
 * @date 2022/9/27 - 21:39
 * hashmap集合允许key为null
 */
public class HashMap集合key部分允许null吗 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null,null);
        System.out.println(map.size());
        System.out.println(map.get(null));


    }
}
