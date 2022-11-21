/**
 * @date 2022/9/3 - 16:00
 */
public class abstract01 {
    public static void main(String[] args) {
        //Account a = new Account();//抽象类无法被实例化
        CreditAccount c = new CreditAccount();
        c.doSome();
        Account a = new CreditAccount();//多态 面向抽象编程 向上转型
        a.doSome();
    }
}
abstract class Account{//抽象类
    public Account(){

    }
    public Account(String name){

    }
    public abstract void doSome();//抽象方法
    public void doOther(){

    }
}
//子类继承抽象类
 class CreditAccount extends Account{
    public CreditAccount(){
        super();
    }

    @Override
    public void doSome() {
        System.out.println("这是一个方法");
    }

}