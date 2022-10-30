package 通过反射机制获取父类和接口;

/**
 * @date 2022/10/12 - 18:53
 */
public class Test01 {
    public static void main(String[] args) throws Exception{
        //String举例
        Class stringClass = Class.forName("java.lang.String");

        //获取String的父类
        Class superClass = stringClass.getSuperclass();
        System.out.println(superClass.getName());

        //获取string类实现的接口
        Class[] interfaces = stringClass.getInterfaces();
        for (Class interfe : interfaces){
            System.out.println("实现的接口--->"+interfe.getName());
        }
    }
}
