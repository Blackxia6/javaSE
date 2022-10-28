package 序列化和反序列化_ObjiectOutputStream_ObjectInputStrem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @date 2022/10/4 - 16:40
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) {
        //反序列化
        ObjectInputStream ois = null;
        try {
             ois = new ObjectInputStream(new FileInputStream("students"));
             //开始反序列化(读)
            Object obj = ois.readObject();
            //反序列化回来是一个学生对象，所以会调用学生对象的toString方法
            System.out.println(obj);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
