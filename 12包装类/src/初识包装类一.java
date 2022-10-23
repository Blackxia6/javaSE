/**
 * @date 2022/9/16 - 15:36
 */
public class 初识包装类一 {
    public static void main(String[] args) {
        //调用doSome（）方法时需要传一个数字，但数字属于基本数据类型，而doSome（）方法参数是object
        //这时可以传一个数字对应的包装类进去
        Byte b1 = 1;
        Double d1 = 1.0;
        Character c1 = '你';
        Boolean b2 = true;
        MyInt myInt = new MyInt(100);
        Integer i = 100;

        doSome(myInt);
        doSome(i);//直接把包装类放进去不需要new对象

    }
    public static void doSome(Object obj){
        System.out.println(obj);
    }
}
class MyInt{//int类型的包装类
    int value;

    public MyInt() {
    }

    public MyInt(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}