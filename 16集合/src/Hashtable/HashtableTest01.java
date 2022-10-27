package Hashtable;

import java.util.Hashtable;
import java.util.Map;

/**
 * @date 2022/9/27 - 21:46
 *1.Hashtable的key和value都不能为null（HashMap的key和value可以为空）
 */
public class HashtableTest01 {
    public static void main(String[] args) {
        Map maptable = new Hashtable();
        maptable.put(1,1);
        maptable.put(null,"123");//NullPointerException

    }
}
