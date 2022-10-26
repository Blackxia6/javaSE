package HomeWork;

/**
 * @date 2022/9/21 - 17:24
 */
public class UserService {
    private String name;
    private String password;

    public UserService() {
    }

    public UserService(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param name 用户名
     * @param password 密码
     * @throws 用户注册Exception 当用户名为null 或者用户名长度小于6或者长度大于14会出现异常
     */
    public void register(String name, String password) throws 用户注册Exception {//注册方法
        if (name.length()<6 || name.length()>14){
            throw new 用户注册Exception("用户名长度太长或太短");
        }
        System.out.println("注册成功");
        System.out.println("用户名："+name+"  "+"密码:"+password);
    }
}
