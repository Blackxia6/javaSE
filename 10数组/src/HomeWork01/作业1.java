package HomeWork01;

import java.util.Scanner;

/**
 * @date 2022/9/9 - 19:55
 * 使用一维数组模拟栈数据结构
 * 要求：
 *   这个栈可以存储java中的任何引用类型的数据
 *   在栈中提供push方法模拟压栈
 *   在栈中提供pop方法模拟弹栈（—栈满了要提示）
 *   编写测试程序，new对象，调试push 和 pop方法来模拟压栈和弹栈的动作
 */
public class 作业1 {
    public static void main(String[] args) {
        MyStack m1 = new MyStack();
        //压栈
        m1.push(new MyStackUp());
        //压栈
        m1.push(new Object());
        m1.push(new Object());
        m1.push(new Object());
        m1.push(new Object());
        m1.push(new Object());
        m1.push(new Object());
        m1.push(new Object());
        //弹栈
        m1.pop();
        m1.pop();
        m1.pop();
        m1.pop();
        m1.pop();
        m1.pop();
        m1.pop();
        m1.pop();
        m1.push(new Object());
        m1.pop();
    }
}
class MyStack{
    Object[] elememts;
    int index;//栈帧
    int b = 0;//当栈满的时候变为1
    int c = 0;//当栈空的时候变为1

    public MyStack() {
        elememts = new Object[5];
    }

    public void push(Object obj){
        Scanner scanner = new Scanner(System.in);

        if (index<(elememts.length) && b == 0){
            elememts[index] = obj;
            //System.out.println(index);
            index = index+1;
            c=0;
            if (index == 5 ){
                index = 4;
                b = 1;
                System.out.println("压栈成功");

//                for (int i = 0; i <=index-1 ; i++) {
//                    System.out.print(elememts[i]+"   ");
//                }
                //System.out.println();
                //return;
            }else {
                System.out.println("压栈成功");
//                for (int i = 0; i <=index-1 ; i++) {
//                    System.out.print(elememts[i]+"   ");
//                }
            }
        }else if (b ==1){
            System.out.println("失败，栈已满");
        }
    }

    public void pop(){
        //System.out.println(index);
        //System.out.println("开始弹栈");
        if ((index-1)>=-1 && c == 0){
            elememts[index] = null;
            index = index-1;
            b=0;
            if (index ==-1){
                index = 0;
                c = 1;
                System.out.println("弹栈成功");
            }else {
                System.out.println("弹栈成功");
            }

        }else if(c==1){
            System.out.println("栈以空，弹栈失败");
        }
    }
}
