package 获取类路径下文件的绝对路径;

import java.io.File;
import java.net.URISyntaxException;

/**
 * @date 2022/10/10 - 19:56
 */
public class AboutPathTest02 {
    public static void main(String[] args) throws URISyntaxException {
        //接下来说一种比较通用的一种路径，及使代码换了位置，这样编写仍然可以使用
        //使用这种方式的前提是，这个文件必须在类路径下（在src下的路径都是类路径）
        //src是类的根路径
        /**
         * Thread.currentThread()--->当前线程对象
         * getContextClassLoader() 是线程对象的方法，可以获取到当前线程的类加载器
         * getResource 【获取资源】类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
         */
        String path = Thread.currentThread().getContextClassLoader().
                getResource("获取Class的三种方式\\FirstMethod.class").toURI().getPath();//这种方式获取文件的绝对路径是通用的
        System.out.println(path);

        String path1 = Thread.currentThread().getContextClassLoader().
                getResource("通过反射实例化对象\\bean\\db.properties").toURI().getPath();
        System.out.println(path1);
    }
}
