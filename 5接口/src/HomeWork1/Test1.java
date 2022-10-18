package HomeWork1;

/**
 * @date 2022/9/5 - 21:02
 */
public class Test1 {
    public static void main(String[] args) {
        InsertDrawable insert1 = new KeyBoard1();//创建键盘1对象
        Computer1 c1 = new Computer1(insert1,"呆鹅");//创建电脑1对象
        System.out.println(c1.getInsertDrawable());
        c1.doSome();

        InsertDrawable insert2 = new Mouse1();//创建鼠标1对象
        Computer1 c2 = new Computer1("呆鹅");//创建电脑2对象
        c2.setInsertDrawable(insert2);
        System.out.println(c2.getInsertDrawable());
        c2.doSome();
    }
}
