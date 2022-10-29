package Sleep方法;

/**
 * @date 2022/10/6 - 20:31
 * 这个程序实现不了左右手写字
 */
public class Test01 {
    public static void main(String[] args) {

        A a = new A();
        a.start();

        for (int i = 0;i<100;i++){
            System.out.println("左");
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class A extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("右");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}