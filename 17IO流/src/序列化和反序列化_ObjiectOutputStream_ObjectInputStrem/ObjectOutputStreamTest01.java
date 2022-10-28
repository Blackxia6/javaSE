package 序列化和反序列化_ObjiectOutputStream_ObjectInputStrem;

import 序列化和反序列化_ObjiectOutputStream_ObjectInputStrem.bean.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @date 2022/10/4 - 16:21
 * java.io.InvalidClassException:
 * 序列化和反序列化_ObjiectOutputStream_ObjectInputStrem.bean.Student; local class incompatible:
 * stream classdesc serialVersionUID = -2164201133972881803,
 * local class serialVersionUID = 5728735226366071967(之前的序列版本号）
 */
public class ObjectOutputStreamTest01  {
    public static void main(String[] args) {
        //创建java对象
        Student s1 = new Student(111111,"zhangsan");
        //序列化(写)
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("students"));
            //序列化对象
            oos.writeObject(s1);//被序列化的对象要实现Serializable接口
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
