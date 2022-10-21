package HomeWork01.武器数组;

/**
 * @date 2022/9/21 - 18:47
 */
public class Army {//军队
    private Weapon[] weapons;//武器数组
    public Army(){}

    /**
     * 创建军队的构造方法
     * @param count 武器的数量
     */
    public Army(int count){
        weapons = new Weapon[count];
    }

    /**
     * 将武器加入数组
     * @param weapon
     */
    public void addWeapon(Weapon weapon) throws WeaponIndexOutOfBoundException {
        for (int i = 0; i <weapons.length ; i++) {
            if (null == weapons[i]){
                weapons[i] = weapon;
                System.out.println(weapons[i]+"武器添加成功");
                return;
            }
        }
        //程序运行到此处说明武器没有添加成功
        throw new WeaponIndexOutOfBoundException("武器已达到上限，加不了");
    }
    public void attackAll(){
        //遍历数组
        for (int i = 0; i <weapons.length ; i++) {
            if (weapons[i] instanceof Shootable){
                Shootable shootable = (Shootable)weapons[i];
                shootable.shoot();
            }
        }
    }

    public void moveAll(){
        for (int i = 0; i <weapons.length ; i++) {
            if (weapons[i] instanceof Moveable){
                Moveable moveable = (Moveable)weapons[i];
                moveable.move();
            }

        }
    }
}
