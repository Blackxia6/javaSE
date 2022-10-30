package 通过反射实例化对象.bean;

/**
 * @date 2022/10/10 - 11:03
 */
public class User {
    int a;
    public User(){
        System.out.println("User的无参数构造方法执行");
    }
    public User(int a){
        System.out.println("User的有参数构造方法");
    }
//static {
//    System.out.println("静态代码块执行");
//}
}
