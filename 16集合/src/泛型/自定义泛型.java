package 泛型;

/**
 * @date 2022/9/25 - 21:00
 */
public class 自定义泛型<E> {
    public void doSome(E e){
        System.out.println(e);
    }

    public static void main(String[] args) {
        自定义泛型<String> gt = new 自定义泛型<>();
        gt.doSome("hello");

        MyIterator<String> mi = new MyIterator<>();
         mi.get("hello world");
    }
}
class MyIterator<S>{
    public void get(S t){
        System.out.println(t);
    }
}
