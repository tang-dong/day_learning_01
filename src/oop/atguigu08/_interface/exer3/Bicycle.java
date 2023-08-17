package oop.atguigu08._interface.exer3;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 23:25
 */
public class Bicycle extends Vehicle{
    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("自行车通过人力脚蹬行驶");
    }
}