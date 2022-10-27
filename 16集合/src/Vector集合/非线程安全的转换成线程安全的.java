package Vector集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @date 2022/9/25 - 20:01
 */
public class 非线程安全的转换成线程安全的 {
    public static void main(String[] args) {
        List myList = new ArrayList();//非线程安全的
        //变成线程安全的
        Collections.synchronizedList(myList);
        myList.add(111);
        myList.add(222);
        myList.add(333);


    }
}
