package finalize方法;

/**
 * @date 2022/9/7 - 20:39
 */
public class finalize方法 {
    public static void main(String[] args) {
        Persion p = new Persion();
        p = null;
        for (int i = 0; i < 500; i++) {
            Persion persion = new Persion();
            persion = null;
            System.gc();//有一段代码建议垃圾回收器启动
        }

    }
}

class Persion {
    @Override
    protected void finalize() throws Throwable {//自动回收。自动调用
        System.out.println(this + "垃圾回收器启动,即将销毁");
    }
}
