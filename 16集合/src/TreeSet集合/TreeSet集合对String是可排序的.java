package TreeSet集合;

import java.util.TreeSet;

/**
 * @date 2022/9/27 - 22:35
 */
public class TreeSet集合对String是可排序的 {
    public static void main(String[] args) {
        //创建一个TreeSet集合
        TreeSet<String> ts = new TreeSet<>();
        //添加元素
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhaosi");
        ts.add("wangliu");

        //遍历
        for (String s : ts){//排序
            System.out.println(s);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(10);
        ts2.add(9);
        ts2.add(80);
        for (Integer s : ts2){
            System.out.println(s);
        }
    }
}
