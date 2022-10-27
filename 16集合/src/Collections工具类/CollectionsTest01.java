package Collections工具类;

import java.util.*;

/**
 * @date 2022/9/28 - 22:17
 * Collections 集合工具类方便集合的操作
 */
public class CollectionsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abe");
        list.add("abf");
        list.add("aba");
        Collections.synchronizedList(list);//转换成线程安全的

        //排序
        Collections.sort(list);
        for (String s : list){
            System.out.println(s);
        }
        List<A> list1 = new ArrayList<>();
        list1.add(new A(100));
        list1.add(new A(20));
        list1.add(new A(10));
        Collections.sort(list1);
        Iterator<A> it = list1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //对set集合怎么排序---->先将set集合转换成List集合 再进行排序
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("kingsoft");
        set.add("king2");
        set.add("king1");
        //将set集合转换成list集合
        List<String> myList = new ArrayList<>(set);//将set集合转换成list集合
        //排序
        Collections.sort(myList);
        for (String ss : myList){
            System.out.println(ss);
        }
    }
}

class A implements Comparable<A>{
    int age;
    public A(int age){
        this.age = age;
    }

    @Override
    public int compareTo(A a) {
        return this.age-a.age;
    }

    @Override
    public String toString() {
        return "A{" +
                "age=" + age +
                '}';
    }
}
