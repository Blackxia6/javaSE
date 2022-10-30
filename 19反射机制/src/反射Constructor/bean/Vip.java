package 反射Constructor.bean;

/**
 * @date 2022/10/12 - 18:18
 */
public class Vip {
    int no;
    String name;
    String birth;
    boolean sex;

    public Vip() {
    }

    public Vip(int no) {
        this.no = no;
    }

    public Vip(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Vip(int no, String name, String birth) {
        this.no = no;
        this.name = name;
        this.birth = birth;
    }

    public Vip(int no, String name, String birth, boolean sex) {
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }
}
