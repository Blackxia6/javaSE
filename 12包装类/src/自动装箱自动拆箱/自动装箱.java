package 自动装箱自动拆箱;

/**
 * @date 2022/9/16 - 16:18
 */
public class 自动装箱 {
    public static void main(String[] args) {
        Integer i = 1000;//自动装箱
        int y = i;//自动拆箱
        System.out.println(i);
        System.out.println(y);

        Integer z = 1000;//z是一个引用，保存了对象的内存地址
        System.out.println(z+1);//这里的z自动拆箱为基本数据类型
        System.out.println(i == z);//i和z保存的内存地址不同 故输出FALSE
        System.out.println(i.equals(z));//true

    }
}
