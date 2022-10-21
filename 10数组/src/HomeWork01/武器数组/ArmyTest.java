package HomeWork01.武器数组;

/**
 * @date 2022/9/21 - 19:17
 */
public class ArmyTest {
    public static void main(String[] args) {
        //构建一个军队
        Army army = new Army(4);
        //创建武器
        Weapon weapon = new 战斗机();//多态
        Weapon weapon1 = new 战斗机();
        Weapon weapon2 = new Tank();
        Tank tank2 = new Tank();
        高射炮 高射炮 = new 高射炮();
        //添加武器
        try {
            army.addWeapon(weapon2);
            army.addWeapon(高射炮);
            army.addWeapon(weapon);
            army.addWeapon(weapon1);
            army.addWeapon(tank2);
        } catch (WeaponIndexOutOfBoundException e) {
            System.out.println(e.getMessage());
        }
        //让所有可移动的移动
        army.moveAll();
        //让所有可攻击的攻击
        army.attackAll();


    }
}
