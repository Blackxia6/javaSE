package HashMap集合.bean;

import java.util.Objects;

/**
 * @date 2022/9/27 - 20:46
 */
public class Student {
    private String name;

    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //hashcode

    //equals(如果学生名字一样表示学生一样)

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null || !(obj instanceof Student) ) return false;
//        if (obj == this) return true;
//        Student stu = (Student)obj;
//        return this.name.equals(stu.name);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
