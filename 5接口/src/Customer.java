/**
 * @date 2022/9/5 - 9:20
 */
public class Customer {//顾客
//顾客手里有菜单（Customer has a FoodMenu）
    //记住 ***有一个 ***  可以用 has a 来修饰 统一用属性的方式存在
    private FoodMenu foodMenu;
    private String name;

    public Customer(String name,FoodMenu foodMenu) {
        this.name = name;
        this.foodMenu = foodMenu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
    public void order(){
       FoodMenu foodMenu =  this.getFoodMenu();
        foodMenu.牛排();
        foodMenu.西红柿炒鸡蛋();
    }

    public static void main(String[] args) {
        FoodMenu foodMenu1 = new ChineseCooker1();//创建厨师对象
        Customer c1 = new Customer("小明",foodMenu1);
        FoodMenu foodMenu2 = new AmericanCooker1();//创建厨师对象
        Customer c2= new Customer("小明",foodMenu2);

//        c1.setFoodMenu(foodMenu1);
//        System.out.print(c1.getName()+"点了菜。");
//        c1.getFoodMenu().牛排();
        c1.order();
        c2.order();

    }
}
