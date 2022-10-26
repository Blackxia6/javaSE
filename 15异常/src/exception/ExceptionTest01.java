package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @date 2022/9/19 - 14:18
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        //通过异常类创建 异常对象
        NumberFormatException nfe = new NumberFormatException("数字格式化异常");
        System.out.println(nfe);
        //通过异常类创建 异常对象
        NullPointerException npe = new NullPointerException("空指针异常");
        System.out.println(npe);
        //通过异常类创建 异常对象
        ArithmeticException are = new ArithmeticException("除数不能为零异常");
        System.out.println(are);

        try {
            FileInputStream fis = new FileInputStream("文件不存在");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
