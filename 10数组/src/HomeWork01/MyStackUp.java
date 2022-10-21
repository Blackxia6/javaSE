package HomeWork01;

/**
 * @date 2022/9/10 - 10:40
 */
/**
 * @date 2022/9/9 - 19:55
 * 使用一维数组模拟栈数据结构
 * 要求：
 *   这个栈可以存储java中的任何引用类型的数据
 *   在栈中提供push方法模拟压栈
 *   在栈中提供pop方法模拟弹栈（—栈满了要提示）
 *   编写测试程序，new对象，调试push 和 pop方法来模拟压栈和弹栈的动作
 */
public class MyStackUp {
    public static void main(String[] args) {
        MyStackUp myStackUp = new MyStackUp();
        myStackUp.push(new Object());
        myStackUp.push(new Object());
        myStackUp.push(new Object());
        myStackUp.push(new Object());
        myStackUp.push(new Object());
        myStackUp.push(new Object());
        myStackUp.push(new Object());
        myStackUp.push(new Object());
        myStackUp.push(new Object());
        myStackUp.push(new Object());
        myStackUp.push(new Object());
        myStackUp.pop();
        myStackUp.pop();
        myStackUp.pop();
        myStackUp.pop();
        myStackUp.pop();
        myStackUp.pop();
        myStackUp.pop();
        myStackUp.pop();
        myStackUp.pop();
        myStackUp.pop();
        myStackUp.pop();
        myStackUp.push(new Object());

    }
    private Object[] objs;
    //栈帧，永远指向栈顶部默认初始值为0
    private int index = -1;
    public MyStackUp() {
        objs = new Object[10];//初始化栈10个位置
    }

    public Object[] getObjs() {
        return objs;
    }

    public void setObjs(Object[] objs) {
        this.objs = objs;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public void push(Object obj){//压栈方法
        if (this.index>=objs.length-1){
            System.out.println("栈已满");
            return;
        }
        this.index++;
        this.objs[index]=obj;
        System.out.println("压栈"+obj+"元素成功，栈帧指向："+index);
    }
    public Object pop(){//弹栈的方法
        if (index<0){
            System.out.println("栈以空，弹栈失败");
            return null;
        }
        System.out.print("弹栈"+objs[index]+"元素成功，栈帧指向：");
        index--;
        System.out.println(index);
        return null;
    }
}
