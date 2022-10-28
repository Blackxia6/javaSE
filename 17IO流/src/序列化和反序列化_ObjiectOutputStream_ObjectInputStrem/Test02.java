package 序列化和反序列化_ObjiectOutputStream_ObjectInputStrem;

import 序列化和反序列化_ObjiectOutputStream_ObjectInputStrem.bean.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * @date 2022/10/4 - 20:15
 */
public class Test02 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("studentTest"));

            Object obj = ois.readObject();
            if (obj instanceof List){
                List<User> list = (List)obj;
                for (User u : list){
                    System.out.println(u);
                }
            }
            //System.out.println(obj);
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
