package collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @date 2022/9/23 - 21:15
 * 结合遍历/迭代
 */
public class Collection集合迭代 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();//多态 --->父类对象指向子类对象

        //添加元素
        c.add(100);
        c.add("hello");
        c.add(true);
        c.add(3.14);
        c.add(new Object());

        //对集合Collection进行遍历
        //第一步:获取集合对象的迭代器对象Interator
        Iterator it = c.iterator();//迭代器it
        //第二步:通过以上获取的迭代器对象开始遍历集合
        int index =0;
        while (it.hasNext()){//遍历/迭代集合
            index++;
            System.out.println("集合中第"+index+"个元素:"+it.next());
        }
    //一次添加多个
        Collection c2 = new ArrayList();
        c2.addAll(c);
        c2.remove("hello");//删除一个元素
        System.out.println("集合c2中的元素个数:"+c2.size());
        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
            it2.remove();
        }
        System.out.println("集合c2中的元素个数:"+c2.size());


    }
}
