package HomeWork01.武器数组;

/**
 * @date 2022/9/21 - 18:55
 * 高射炮可以攻击不可以移动
 */
public class 高射炮 extends Weapon implements Shootable{

    @Override
    public void shoot() {
        System.out.println("高射炮射击");
    }

    @Override
    public String toString() {
        return "高射炮";
    }
}
