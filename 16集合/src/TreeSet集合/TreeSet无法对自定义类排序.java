package TreeSet集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @date 2022/9/27 - 22:44
 * 异常 --->ClassCastException
 */
public class TreeSet无法对自定义类排序 {
    public static void main(String[] args) {
        Person p1 = new Person(200);
        Person p2 = new Person(32);
        Person p3 = new Person(1);
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        Iterator<Person> it = persons.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Person{
    int age;

    public Person(int age) {
        this.age = age;
    }
    //重写toString方法
    public String toString(){
        return "Persion[age="+age+"]";
    }
}
