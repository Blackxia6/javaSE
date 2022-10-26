package finally子句;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @date 2022/9/20 - 15:08
 * finally要和try一起用
 */
public class trycatch子语句块finally {
    public static void main(String[] args) {
        FileInputStream fis =null;//声明位置放在外面，这样在finally里中才能用
        try {
            //创建输入流对象
          fis = new FileInputStream("C:新建文本文档 (2).txt");
            String s = null;
            //一定会出现空指针异常
            s.toString();

            //流使用完是要关闭的，因为流是要占用资源的.及使以上程序出现异常也要关闭
            //放在这里可能关闭不了
            //fis.close();//可能无法运行
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (NullPointerException e ){
            e.printStackTrace();
        }finally {
            System.out.println("hello 浩克");
            //流的关闭放在这里比较保险
            //finally里的代码一定会执行
            if (fis != null){//避免空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println("hekko");
    }
}
