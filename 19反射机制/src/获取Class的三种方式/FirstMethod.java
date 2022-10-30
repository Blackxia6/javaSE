package 获取Class的三种方式;

/**
 * @date 2022/10/10 - 9:19
 * Class.forName("java.lang.String");
 *  静态方法
 *  方法的参数是一个字符串
 *  字符串需要的是一个完整的类名，完整类名必须带包名
 */
public class FirstMethod {
    public static void main(String[] args) {
        try {
            Class c1 = Class.forName("java.lang.String");//c1代表String.class文件 或者说c1代表String类型
            Class c2 = Class.forName("java.util.Date");//c2代表Date类型
            Class c3 = Class.forName("java.lang.Integer");
            Class c4 = Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
