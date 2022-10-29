package 实现生产者和消费者模式.左右手写字;

import java.util.Objects;

/**
 * @date 2022/10/10 - 8:38
 */
public class Test01 {
    public static void main(String[] args) {
        Str str = new Str("左");
        Thread t1 = new Thread(new Left01(str));
        Thread t2 = new Thread(new Right01(str));
        t1.setName("左手写字");
        t2.setName("右手写字");

        t1.start();
        t2.start();
    }
}
class Str{
    private String s;
    public Str(String s){
        this.s = s;
    }
    public void setS(String s){
        this.s = s;
    }
    public String getS(){
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Str str = (Str) o;

        return Objects.equals(s, str.s);

    }


}