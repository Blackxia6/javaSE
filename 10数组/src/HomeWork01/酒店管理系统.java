package HomeWork01;

import java.util.Scanner;

/**
 * @date 2022/9/9 - 22:00
 * 为某个酒店编写程序：酒店管理系统：模拟订房、退房、打印所有房间状态
 * 1.该系统的用户是：酒店前台
 * 2.酒店使用一个二维数组来模拟“Room[][] rooms”
 * 3.酒店中的没哟个房间应该是一个java对象：Room
 * 4.每一个房间应该有：房间号 房间类型 房间是否空闲
 * 5.系统应该对外提供：
 *    可以订房 输入房间编号
 *    可以退房 输入房间号
 *    可以查看所有房间状态
 */
public class 酒店管理系统 {
    public static void main(String[] args) {
        Room r1 = new Room();
        Customer c1 = new Customer();
        Room[][] rooms = {
                {new Room(),new Room(),new Room()},
                {new Room(),new Room(),new Room()},
                {new Room(),new Room(),new Room()}
        };
        rooms[0][0].num=1001;
        rooms[0][0].style="套间";
        rooms[0][0].time=0;

        rooms[0][1].num=1002;
        rooms[0][1].style="套间";
        rooms[0][1].time=0;

        rooms[0][2].num=1003;
        rooms[0][2].style="套间";
        rooms[0][2].time=0;

        rooms[1][0].num=2001;
        rooms[1][0].style="豪华套间";
        rooms[1][0].time=0;

        rooms[1][1].num=2002;
        rooms[1][1].style="豪华套间";
        rooms[1][1].time=0;

        rooms[1][2].num=2003;
        rooms[1][2].style="豪华套间";
        rooms[1][2].time=0;

        rooms[2][0].num=3001;
        rooms[2][0].style="总统套房";
        rooms[2][0].time=0;

        rooms[2][1].num=3002;
        rooms[2][1].style="总统套房";
        rooms[2][1].time=0;

        rooms[2][2].num=3003;
        rooms[2][2].style="总统套房";
        rooms[2][2].time=1;

        /*r1.check(rooms);//查房
        c1.close(rooms);//退房
        r1.check(rooms);//查房
        c1.open(rooms);//订房
        r1.check(rooms);//查房*/
        System.out.println("欢迎使用酒店管理系统，请认真阅读以下规则");
        System.out.println("请输入对应的功能编号:[1]表示查看房间列表。[2]表示订房。[3]表示退房。[0]表示退出");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("请输入功能编号:");
            int i = scanner.nextInt();
            if (i==1){
               r1.check(rooms);
            }else if (i==2){

                //int roomNum = scanner.nextInt();
                c1.open(rooms);
            }else  if (i==3){
                System.out.print("请输入退房间编号:");
                //int roomNum = scanner.nextInt();
                c1.close(rooms);
            }else  if(i==0){
                System.out.println("欢迎下次再来");
                return;
            }else {
                System.out.println("错误。请输入正确的功能编号");
            }
        }
    }


}
class Room{
    int num;
    String style;
    int time;
    public void check(Room[][] rooms){//查询房间是否空闲
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0;j<rooms[i].length;j++){
                System.out.print(rooms[i][j].num+"房间的状态:"+rooms[i][j].time+"  ");
            }
            System.out.println();
        }
    }

}
class Customer{

    public void close(Room[][] rooms){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要退房的编号:");
        int tui = scanner.nextInt();
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0;j<rooms[i].length;j++){
                if (tui == rooms[i][j].num && rooms[i][j].time==1){
                    rooms[i][j].time=0;
                    System.out.println("退房成功");
                }
            }

        }
    }
    public void open(Room[][] rooms){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要定房的编号:");
        int din = scanner.nextInt();
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0;j<rooms[i].length;j++){
                if (din == rooms[i][j].num && rooms[i][j].time==0){
                    rooms[i][j].time=1;
                    System.out.println("订房成功");
                }
                }
            }
        }
    }

