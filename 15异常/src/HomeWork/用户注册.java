package HomeWork;

import java.util.Scanner;

/**
 * @date 2022/9/21 - 17:19
 */
public class 用户注册 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("请输入注册用户名:");
            String name = scanner.next();
            System.out.print("请输入注册密码:");
            String password = scanner.next();
            UserService u1 = new UserService();
            try {
                u1.register(name,password);
                System.exit(0);
            } catch (用户注册Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
