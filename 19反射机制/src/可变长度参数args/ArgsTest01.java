package 可变长度参数args;

/**
 * @date 2022/10/12 - 14:44
 * 可变长度参数
 * 语法：类型...（这里一定是三个点）
 * 1.可变长度参数要求参数个数是0-N个
 * 2.可变长度参数在参数列表中必须是最后一个位置上，而且可变长度参数只能有一个
 */
public class ArgsTest01 {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,20);
        System.out.println("===============");
        m2(10);
        m2(10,"abc");
        m2(10,"abc","ABC");
        System.out.println("=================");
        m3("a","ab","abc");
        System.out.println("================");
        //可以传一个数组
        String[] str = {"aaa","bbb","ccc"};
        m3(str);

    }
    public static void m(int...args){
        System.out.println("m方法执行了");
    }

    public static void m2(int a,String...arg){
        System.out.println("m2方法执行了");
    }
    public static void m3(String...args){
        //args有length属性，说明args是一个数组
        //可以把可变长度参数看成一个数组
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}


