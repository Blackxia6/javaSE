package 通过反射实例化对象;

/**
 * @date 2022/10/10 - 17:10
 * 研究一下：Class.forName()发生了什么？
 *   注意，如果你只想一个类的静态代码块执行，其他代码一律不执行，可以用，Class.forName("完整类名")
 *     这个方法执行会导致类加载，类加载时静态代码块执行
 */
public class ReflectTest03 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        try {
            Class c = Class.forName("通过反射实例化对象.MyClass");//实现类加载
            //Object obj = c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class MyClass{
    //静态代码块在类加载时执行，并且只执行一次
    static {
        System.out.println("MyClass类的静态代码块执行了！！！");
    }
    public MyClass(){
        System.out.println("无参数构造方法");
    }
}