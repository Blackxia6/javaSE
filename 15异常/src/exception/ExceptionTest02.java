package exception;

/**
 * @date 2022/9/19 - 21:43
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(100/0);
        }catch (Exception e){
            System.out.println("除数不能为零");
        }

        System.out.println("hello world");
    }
}
