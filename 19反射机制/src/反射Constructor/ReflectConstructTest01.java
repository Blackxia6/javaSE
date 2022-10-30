package 反射Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * @date 2022/10/12 - 18:20
 * 反编译一个类的Construct构造方法
 */
public class ReflectConstructTest01 {
    public static void main(String[] args) throws Exception{
        StringBuilder s = new StringBuilder();
        Class vipClass = Class.forName("反射Constructor.bean.Vip");
        s.append(Modifier.toString(vipClass.getModifiers()));
        s.append(" ");
        s.append("class ");
        s.append(vipClass.getSimpleName());
        s.append("{\n");
//        public Vip(int no) {
//            this.no = no;
//        }
        //拼接构造方法
        Constructor[] constructors = vipClass.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(vipClass.getSimpleName());
            s.append("(");
            //拼接参数
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes){
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            if (parameterTypes.length>0){
                s.deleteCharAt(s.length()-1);
            }

            s.append("){}\n");

        }

        s.append("}");
        System.out.println(s);

    }
}
