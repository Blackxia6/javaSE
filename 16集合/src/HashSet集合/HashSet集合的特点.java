package HashSet集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @date 2022/9/26 - 8:48
 */
public class HashSet集合的特点 {
    public static void main(String[] args) {
        //演示一下HashSet集合的特点
        Set<String> stringSet = new HashSet<>();

        //添加元素
        stringSet.add("hello3");
        stringSet.add("hello4");
        stringSet.add("hello1");
        stringSet.add("hello2");
        stringSet.add("hello3");
        //遍历set集合
        for (String s : stringSet){//无序不可重复
            System.out.println(s);
        }
        System.out.println("===================================");
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
