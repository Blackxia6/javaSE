package TreeSet集合;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @date 2022/9/27 - 23:10
 */
public class TreeSet无法对自定义类排序解决方法 {
    public static void main(String[] args) {
        User p1 = new User(200);
        User p2 = new User(32);
        User p3 = new User(1);
        TreeSet<User> persons = new TreeSet<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        Iterator<User> it = persons.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class User implements Comparable<User>{//放在TreeSet集合中的元素需要实现java.lang.Comparable接口
    int age;
    public User(int age){
        this.age = age;
    }

    @Override
    public int compareTo(User c) {//需要在这个方法中编写比价逻辑,或者比较规则
        //c1.compareTo(c2)
        //this就是c1  c就是c2  比较 c1 和 c2 就是比较this和c

        return this.age-c.age;
    }
    //重写toString方法
    public String toString(){
        return "User[age="+age+"]";
    }
}