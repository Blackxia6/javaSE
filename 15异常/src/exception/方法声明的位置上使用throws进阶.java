package exception;

/**
 * @date 2022/9/19 - 22:25
 */
public class 方法声明的位置上使用throws进阶 {
    //第一种方式：在方法声明的位置上继续使用throws 来完成异常的继续上抛，抛给调用者
    public static void main(String[] args) {
        //在main方法中调用doSome()方法
        //因为doSome()方法声明位置上有throws ClassNotFoundException
        //我们在调用doSome()方法的时候必须对这种异常进行预先处理，如果不处理，编译器就报错
        //doSome();//Error:(11, 15) java: 未报告的异常错误java.lang.ClassNotFoundException; 必须对其进行捕获或声明以便抛出
        try {//捕捉异常，真正解决异常
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * doSome()方法在方法声明的位置上使用了：throws ClassNotFoundException
     * 这个代码表示doSome()方法只是执行过程中，可能会出现ClassNotFoundException异常（类没有找到异常）
     * @throws ClassNotFoundException 编译时异常
     */
    public static void doSome() throws ClassNotFoundException{//类没有找到异常
        System.out.println("doSmoe()");
    }
}
