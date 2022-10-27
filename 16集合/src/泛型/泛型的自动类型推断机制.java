package 泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @date 2022/9/25 - 20:50
 * 自动类型推断机制(又称“砖石表达式”)
 */
public class 泛型的自动类型推断机制 {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new Animal());
        Iterator<Animal> it = list.iterator();
        while (it.hasNext()){
            Animal a = it.next();
            a.move();
        }
    }
}
