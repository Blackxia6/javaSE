package TreeSet集合;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @date 2022/9/28 - 21:54
 */
//TreeSet集合中元素可排序的第二种方式，使用比较器的方式
public class 实现比较器接口comparator {
    public static void main(String[] args) {
        //创建TreeSet集合的时候，需要使用这个比较器
        //TreeSet<WuGui> wuGuis = new TreeSet<>();这样不行，因为没有通过构造器方法传递一个比较器进去
        TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());
        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(800));
        wuGuis.add(new WuGui(810));
        for (WuGui wuGui : wuGuis){
            System.out.println(wuGui);
        }
    }
}

class WuGui{
    int age;
    public WuGui(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "小乌龟{" +
                "age=" + age +
                '}';
    }
}

//单独在这里编写一个比较器
//比较器实现java.util.Comparator接口
class WuGuiComparator implements Comparator<WuGui>{

    @Override
    public int compare(WuGui o1, WuGui o2) {
        //指定比较规则
        return o1.age-o2.age;
    }
}