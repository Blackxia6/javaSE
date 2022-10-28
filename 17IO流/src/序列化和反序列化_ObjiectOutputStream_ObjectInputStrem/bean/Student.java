package 序列化和反序列化_ObjiectOutputStream_ObjectInputStrem.bean;

import java.io.Serializable;

/**
 * @date 2022/10/4 - 16:22
 */
public class Student implements Serializable {//Serializable接口是一个标志性接口
    private static final long serialVersionUID = -2164201133972881803L;
    //private static final long serialVersionUID = 86834525811228929L;//初始化序列化版本号

    private int no;
    private String name;


    public Student() {
    }

    public Student(int no, String name) {
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
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
