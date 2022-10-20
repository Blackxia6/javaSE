/**
 * @date 2022/9/1 - 22:25,
 */
import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(300,20);
        Scanner s = new Scanner(System.in);
        System.out.print("请输入加速的速度：");
        int u = s.nextInt();
        v.speedUp(u);
        System.out.print("请输入减速的速度：");
        int j = s.nextInt();
        v.speedDown(j);
    }
}
    class Vehicle{
        private int speed;
        private int size;
        public Vehicle(){


        }
        public Vehicle(int size,int speed){
            this.size = size;
            this.speed = speed;
            System.out.println("现在车速为:"+this.speed);
            System.out.println("现在车体积为："+this.size);
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void speedUp(int up){
            this.speed = speed+up;
            System.out.println("加速"+up+",现在速度为："+speed);
        }
        public void speedDown(int down){
            if (this.speed<=down){
                this.speed = 0;
                System.out.println("速度减到0，成功刹车");
            }else{
                this.speed = speed-down;
                System.out.println("减速"+down+",现在速度为："+speed);
            }

        }
    }

