package collection接口;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @date 2022/9/23 - 20:34
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        //Collection c = new Collection();接口是抽象的无法实例化、
        Collection c = new ArrayList();//多态
        //测试collection接口中的的常用方法
        c.add(100);//自动装箱---->Integer x = new Integer(100);
        c.add("hello world");
        c.add(new Object());
        c.add(true);//自动装箱

        System.out.println("集合中元素的个数是:"+c.size());
        c.clear();//清空集合中的元素
        System.out.println("集合中元素的个数是:"+c.size());
        //向集合中添加元素
        c.add(100);
        c.add(new Object());
        c.add(true);
        c.add("hello");//存储的是hello的内存地址
        c.add("world");//存储的是world的内存地址

        //判断集合中是否包含 hello
        boolean flag = c.contains("hello");
        System.out.println(flag);//true
        //删除集合中的某个元素
        System.out.println("集合中元素的个数是:"+c.size());
        c.remove("world");
        System.out.println("集合中元素的个数是:"+c.size());
        System.out.println(c.isEmpty());

        //转换成数组
        Object[] obj = c.toArray();
        //循环数组
        for (int i = 0; i <obj.length ; i++) {
            System.out.println("obj["+i+"]\t"+obj[i]);
        }


    }
}
