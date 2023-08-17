package oop.atguigu08._interface;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 22:53
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);

        System.out.println(Flyable.MAX_SPEED);

        Bullet b1 = new Bullet();
        b1.fly();
        b1.attack();

        //接口的多态性
        Flyable f1 = new Bullet();
        f1.fly();
    }
}

interface Flyable{ //接口
    //全局常量
    public static final int MIN_SPEED = 0;

    //可以省略 public static final
    int MAX_SPEED = 7900;

    //方法可以省略 public abstract 声明
    void fly();
}

interface Attackable{ //接口
    public abstract void attack();
}

abstract class Plane implements Flyable {

}

class Bullet implements Flyable,Attackable{
    @Override
    public void fly() {
        System.out.println("让子弹飞一会儿");
    }

    @Override
    public void attack() {
        System.out.println("子弹可以击穿身体");
    }
}