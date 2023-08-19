package api.atguigu01.string.exer3;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-19 21:53
 */
public class User {
    private String name;
    private String password;//密码

    public User() {
    }

    public User(String name, String password) {
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

    @Override
    public String toString() {
        return name + "-" + password;
    }
}