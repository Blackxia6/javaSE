package HashMap集合.bean;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @date 2022/9/27 - 20:48
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");
        System.out.println(s2.equals(s1));//重写equals方法后为true
        System.out.println("s1的hashcode="+s1.hashCode());
        System.out.println("s2的hashcode="+s2.hashCode());

        //现在s2.equals(s1)是true，表示s2和s1是一样的，那么往HashSet集合中放的话只能放一个
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());

    }
}
