package foreach;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/9/25 - 21:33
 */
public class Test01 {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add(1);
        li.add("hello");
        li.add(true);
        li.add(3.14);
//使用增强for循环
        for (Object o : li){
            System.out.println(o);
        }
    }
}
