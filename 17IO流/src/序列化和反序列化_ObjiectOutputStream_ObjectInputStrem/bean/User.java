package 序列化和反序列化_ObjiectOutputStream_ObjectInputStrem.bean;

import java.io.Serializable;

/**
 * @date 2022/10/4 - 16:47
 */
public class User implements Serializable {
    private int no;
    private transient String name;

    public User() {
    }

    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
