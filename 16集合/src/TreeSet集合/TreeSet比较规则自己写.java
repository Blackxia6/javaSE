package TreeSet集合;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @date 2022/9/28 - 20:09
 * 先按照年龄升序，如果年龄一样再按照姓名升序
 */
public class TreeSet比较规则自己写 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();
        vips.add(new Vip("zhangsi",22));
        vips.add(new Vip("zhangsan",22));
        vips.add(new Vip("king",18));
        vips.add(new Vip("soft",17));

        for (Vip vip : vips){
            System.out.println(vip);
        }
        System.out.println("================");
        Iterator<Vip> it = vips.iterator();
        while (it.hasNext()){
           Vip node = it.next();
            System.out.println(node);
        }
    }
}

class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     *
     * @param v
     * @return
     * 返回0表示想等，value会覆盖
     * 返回值大于0，会继续在右子树上找
     * 返回值小于0，会继续在左子树上找
     */
    @Override
    public int compareTo(Vip v) {
       if (this.age == v.age){
           //年龄相同时按照姓名比较
           return this.name.compareTo(v.name);
       }else {
           return this.age-v.age;
       }
       //return this.age == v.age ? this.name.compareTo(v.name) : this.age-v.age;
    }
}