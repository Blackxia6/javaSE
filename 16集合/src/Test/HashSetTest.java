package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @date 2022/9/29 - 19:54
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("bcd");
        set.add("cde");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (String s : set){
            System.out.println(s);
        }
        HashSet<student> stu = new HashSet<>();
        student s1 = new student(331,"a");
        student s2 = new student(222,"b");
        stu.add(s2);
        stu.add(s1);
        System.out.println(stu.size());
        Iterator<student> it3 = stu.iterator();
        while (it3.hasNext()){
            System.out.println(it3.next());
        }
        for (student s : stu){
            System.out.println(s);
        }
    }
}
class student{
    int no ;
    String name;

    public student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return no == student.no &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}