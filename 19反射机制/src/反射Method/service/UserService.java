package 反射Method.service;

/**
 * @date 2022/10/12 - 16:26
 * 用户业务类
 */
public class UserService {


    /**
     *
     * @param name      用户名
     * @param password   密码
     * @return    true表示登录成功 false表示登录失败
     */
    public boolean login(String name,String password){
        if ("admin".equals(name) && "123".equals(password)){
            return true;
        }
        return false;
    }

    //退出系统方法
    public void logout(){
        System.out.println("系统安全退出");
    }

//    public static void A(){
//        System.out.println("A方法执行");
//    }
}
