/**
 * @date 2022/9/2 - 22:00
 */
public class finalTest02 {
    //final修饰的变量是引用
    public static void main(String[] args) {
        Persion p = new Persion(30);
        final Persion p1 = new Persion(30);
        p1.age=20;
       // p1 = new Persion(20)不可以赋值，被final修饰
        User u = new User();
        System.out.println(u.age);
    }
}
class Persion{
    int age;

    public Persion() {
    }

    public Persion(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class User{
    //final修饰的实例变量必须手动赋值
    final int age;
    public User(){
        this.age=41;
    }


}