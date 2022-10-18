/**
 * @date 2022/9/1 - 21:49
 */
public class User {
    private int id;
    private String name;
    private String birth;

    public User() {//无参数的构造方法

    }

    public User(int id, String name, String birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User..........";
    }
}
