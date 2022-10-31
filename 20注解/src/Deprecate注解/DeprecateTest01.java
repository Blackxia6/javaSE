package Deprecate注解;

/**
 * @date 2022/10/12 - 21:18
 */
@Deprecated//表示这个类过时了
public class DeprecateTest01 {
    public static void main(String[] args) {
        DeprecateTest01 d = new DeprecateTest01();
        d.doSome();
    }
    @Deprecated
    public  void doSome(){
        System.out.println("do something");
    }

    public void doOther(){
        System.out.println("do other....");
    }
}


