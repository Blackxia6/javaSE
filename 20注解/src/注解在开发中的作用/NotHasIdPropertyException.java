package 注解在开发中的作用;

/**
 * @date 2022/10/12 - 22:49
 * 自定义异常类
 */
public class NotHasIdPropertyException extends Exception{
    public NotHasIdPropertyException() {

    }

    public NotHasIdPropertyException(String s) {
        super(s);
    }
}
