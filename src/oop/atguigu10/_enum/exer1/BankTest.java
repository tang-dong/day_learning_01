package oop.atguigu10._enum.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-18 0:18
 */
public class BankTest {
    public static void main(String[] args) {
        System.out.println(GirlFriend.XIAO_LI);
    }
}

//jdk5.0之前的使用枚举类定义单例模式
class Bank1{
    private Bank1() {

    }

    public static final Bank1 instance = new Bank1();
}

//jdk5.0使用enum关键字定义枚举类的方式定义单例模式
enum Bank2 {
    CPB;
}

enum GirlFriend{
    XIAO_LI(20);

    private final int age;

    private GirlFriend(int age){
        this.age = age;
    }
}