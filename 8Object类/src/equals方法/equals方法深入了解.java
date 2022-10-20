package equals方法;

import java.util.Objects;

/**
 * @date 2022/9/6 - 22:09
 */
public class equals方法深入了解 {
    public static void main(String[] args) {
        //Address addr = new Address("北京","大兴区","111111");
        User u1 = new User("xwj", new Address("北京", "大兴区", "111111"));
        User u2 = new User("xwj", new Address("北京", "大兴区", "111111"));
        System.out.println(u1.equals(u2));//true
        User u3 = new User("xwj", new Address("北京", "大区", "111111"));
        System.out.println(u1.equals(u3));//名字相同，街道不同false

    }
}

class User {
    String name;
    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    //重写equals方法
    //规则：当一个用户的用户名和家庭住址都相同，表示同一个用户。
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof User)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        User user = (User) obj;
        if (this.name.equals(user.name) && this.addr.equals(user.addr)) {
            return true;
        }
        return false;
    }
}

class Address {
    String city;
    String street;
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Address)) return false;
        Address address = (Address) o;
        return this.city.equals(address.city)
                && this.street.equals(address.street)
                && this.zipcode.equals(address.zipcode);
    }

}