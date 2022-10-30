package 通过反射实例化对象;

/**
 * @date 2022/10/10 - 11:03
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        //通过反射机制去获取Class 通过Class来实例化对象
        Class c =null;
        try {
             c = Class.forName("通过反射实例化对象.bean.User");
             Object obj = c.newInstance();//创建User实例--->相当于new对象(newInstance调用的是无参数构造方法)

            System.out.println(obj);//通过反射实例化对象.bean.User@b4c966a
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
