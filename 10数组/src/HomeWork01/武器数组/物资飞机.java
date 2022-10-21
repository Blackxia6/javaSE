package HomeWork01.武器数组;

/**
 * @date 2022/9/21 - 18:57
 * 物资飞机是武器，可以移动但是不能攻击
 */
public class 物资飞机 extends Weapon implements Moveable{
    @Override
    public void move() {
        System.out.println("物资飞机起飞");
    }
    @Override
    public String toString() {
        return "物资飞机";
    }
}
