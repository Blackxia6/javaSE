package HomeWork01.武器数组;

/**
 * @date 2022/9/21 - 18:56
 * 战斗机可以移动可以攻击
 */
public class 战斗机 extends Weapon implements Moveable,Shootable{
    @Override
    public void move() {
        System.out.println("战斗机飞行");
    }

    @Override
    public void shoot() {
        System.out.println("战斗机攻击");
    }
    @Override
    public String toString() {
        return "战斗机";
    }
}
