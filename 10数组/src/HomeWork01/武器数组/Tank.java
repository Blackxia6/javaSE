package HomeWork01.武器数组;

/**
 * @date 2022/9/21 - 18:52
 * 坦克是武器，可移动，可以攻击
 */
public class Tank extends Weapon implements Moveable,Shootable{//坦克是武器.可以移动，可以攻击
    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克攻击");
    }
    @Override
    public String toString() {
        return "坦克";
    }
}
