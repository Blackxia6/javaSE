/**
 * @date 2022/9/3 - 13:41
 */
public class fianlTest03 {
    public static void main(String[] args) {
        System.out.println(Chinese.COUNTRY);
        Chinese c = new Jopen();//多态
        c.dosome();
    }
}
class Chinese{
    String idCard;//身份证号
    private final String name = "xwj";//姓名
    String birthday;//生日
    public final static String COUNTRY="中国";//国籍   常量

    public String getName() {
        return name;
    }
    public void dosome(){

    }
}
class Jopen extends Chinese{
    public void dosome(){
        System.out.println(this.getName());
    }
}
