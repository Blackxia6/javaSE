package HashMap集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @date 2022/9/26 - 22:13
 */
public class HashMap集合key部分元素的特点 {
    public static void main(String[] args) {
        //测试HashMap集合key部分的元素特点
        //Integer是key，它的hashcode和equals都重写了
        Map<Integer,String> map = new HashMap<>();
        map.put(1111,"zhangsan");
        map.put(6666,"lisi");
        map.put(7777,"wangwu");
        map.put(2222,"zhaoliu");
        map.put(2222,"king");//key重复的时候value会自动覆盖
        System.out.println(map.size());
        //遍历
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> node : set){
            //输出的是的无序不可重复的
            System.out.println(node.getKey()+"="+node.getValue());
        }

    }
}
