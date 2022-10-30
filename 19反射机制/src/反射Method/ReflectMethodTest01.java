package 反射Method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @date 2022/10/12 - 16:25
 * 作为了解内容
 *   反射Method
 */
public class
ReflectMethodTest01 {
    public static void main(String[] args) throws Exception {
        Class UserServiceClass = Class.forName("反射Method.service.UserService");
        //获取所有的Method
        Method[] methods = UserServiceClass.getDeclaredMethods();//获取所有的方法
        System.out.println(methods.length);//2
        //遍历Method
        for (Method method : methods){
            //获取方法名
            System.out.println("方法名--->"+method.getName());
            //获取方法的返回值类型
            Class MethodType = method.getReturnType();
            System.out.println("返回值类型--->"+MethodType.getName());
            //获取修饰符列表
            int modify = method.getModifiers();
            System.out.println("修饰符列表--->"+ Modifier.toString(modify));
            //获取方法的参数列表
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes){
                System.out.println("参数的类型--->"+parameterType.getSimpleName());

            }
            System.out.println("=============================");

        }

    }
}
