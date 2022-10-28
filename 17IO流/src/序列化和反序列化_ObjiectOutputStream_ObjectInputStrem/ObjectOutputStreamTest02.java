package 序列化和反序列化_ObjiectOutputStream_ObjectInputStrem;

import 序列化和反序列化_ObjiectOutputStream_ObjectInputStrem.bean.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/4 - 16:47
 * 一次序列化多个对象
 *  把对象放到集合当中即可
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(111,"zhangsan"));
        userList.add(new User(222,"lisi"));

        ObjectOutputStream oos = null;
        try {
             oos = new ObjectOutputStream(new FileOutputStream("Users"));
             oos.writeObject(userList);//一次序列化集合

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
