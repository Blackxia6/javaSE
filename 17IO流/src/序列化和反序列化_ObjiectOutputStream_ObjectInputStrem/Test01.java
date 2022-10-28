package 序列化和反序列化_ObjiectOutputStream_ObjectInputStrem;

import 序列化和反序列化_ObjiectOutputStream_ObjectInputStrem.bean.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @date 2022/10/4 - 20:10
 */
public class Test01 {//序列化

    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        List<User> userList = new ArrayList<>();
        userList.add(new User(1111111111,"sfsfsd"));
        userList.add(new User(4444444,"sfesfs w"));
        try {
            oos = new ObjectOutputStream(new FileOutputStream("studentTest"));
            User user = new User(22222222,"xje");
            oos.writeObject(userList);


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
