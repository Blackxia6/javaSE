package valueOf方法;

/**
 * @date 2022/9/15 - 18:02
 */
public class valueOf {
    public static void main(String[] args) {
        //将非字符串转换成字符串
        String s1 = String.valueOf(true);
        System.out.println(s1);

        String s2 = String.valueOf(100);
        System.out.println(s2);
        String s3 = s2.substring(1,3);//截取  左闭右开
        System.out.println(s3);

        String s4 = String.valueOf(new Customer());
        System.out.println(s4);
        System.out.println(100);
    }
}

class Customer{
    @Override
    public String toString() {
        return "我是Customer对象";
    }
}