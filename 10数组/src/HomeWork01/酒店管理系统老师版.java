package HomeWork01;

import java.util.Scanner;

/**
 * @date 2022/9/11 - 14:09
 */
public class 酒店管理系统老师版 {
    public static void main(String[] args) {
        Hotel h1 = new Hotel();
        System.out.println("欢迎使用酒店管理系统，请认真阅读以下规则");
        System.out.println("请输入对应的功能编号:[1]表示查看房间列表。[2]表示订房。[3]表示退房。[0]表示退出");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("请输入功能编号:");
            int i = scanner.nextInt();
            if (i==1){
                h1.print();
            }else if (i==2){
                System.out.print("请输入定房间编号:");
                int roomNum = scanner.nextInt();
                h1.order(roomNum);
            }else  if (i==3){
                System.out.print("请输入退房间编号:");
                int roomNum = scanner.nextInt();
                h1.exit(roomNum);
            }else  if(i==0){
                System.out.println("欢迎下次再来");
                return;
            }else {
                System.out.println("错误。请输入正确的功能编号");
            }

        }
        }

}
class Rooms{
    private int no;//房间编号
    private String type;//房间类型
    private boolean status;//房间状态

    public Rooms() {
    }

    public Rooms(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //equals方法重写

    //toString方法重写
    public String toString(){
        return "["+no+","+type+","+(status ? "空闲" :"占用")+"]";
    }

    public boolean equals(Object obj){
    if (obj == null || !(obj instanceof Rooms)) return false;
    if (this == obj)return true;
    Rooms r = (Rooms)obj;
    return this.getNo() == r.getNo();
    }
}
//酒店中有二维数组模拟大厦
class Hotel{
    private Rooms[][] room;
    public Hotel(){//通过构造方法来盖楼
        room = new Rooms[3][10];//三层楼，每层10个房间

        for (int i = 0; i <room.length ; i++) {
            for (int j = 0;j<room[i].length;j++){
                if (i==0){
                    room[i][j] = new Rooms((i+1)*100+j+1,"单人间",true);
                }else if (i==1){
                    room[i][j] = new Rooms((i+1)*100+j+1,"双人间",true);
                }else {
                    room[i][j] = new Rooms((i+1)*100+j+1,"豪华间",true);
                }
            }
        }
    }

    public void print(){
        for (int i = 0; i <room.length ; i++) {
            for (int j =0;j<room[i].length;j++){
                System.out.print(room[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void order(int num){//订房
        Rooms rooms = room[num/100-1][num%100-1];
        rooms.setStatus(false);
        System.out.println(num+"订房成功过");
    }
    public void exit(int num){//退房
        Rooms rooms = room[num/100-1][num%100-1];
        rooms.setStatus(true);
        System.out.println(num+"退房成功");
    }
}
