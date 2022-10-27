package collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * @date 2022/9/24 - 13:27
 */
public class Contains方法深入 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("123");
        c.add(s1);
        String s2 = new String("abc");
        c.add(s2);
        String x = new String("abc");
        System.out.println(c.contains(x));//不包含x，但是调用了 String类的 equals方法，内容相同  true

        User u1 = new User("jack");
        c.add(u1);
        User u2 = new User("jack");
        System.out.println(c.contains(u2));//由于 User类 没有重写equals方法，会调用object类的equals方法  false
    }
}
class User{
    private String name;
    public User(){}

    public User(String name) {
        this.name = name;
    }


/*public boolean equals(Object o) {
    if (o == null || !(o instanceof User)) return false;
    if (o == this) return true;
    User u = (User)o;
    return u.name.equals(this.name);
    }*/

}
