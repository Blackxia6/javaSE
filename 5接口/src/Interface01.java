/**
 * @date 2022/9/4 - 10:40
 */
public class Interface01 {
    public static void main(String[] args) {
        B b = new C();
        D d = new D();
        System.out.println(d.sub(1,2));

    }
}
interface A{//接口
    public static final double PI = 3.1415;//常量
    public abstract int sub(int a,int b);//抽象方法

}
class B {
    public final void dos(){
        System.out.println("C‘s doSome");
    }


}
class C extends B {

}
class D implements A{//实现接口A

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}

