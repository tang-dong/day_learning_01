package oop.atguigu08._interface.exer3;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 23:42
 */
public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle() {

    }

    public ElectricVehicle(String brand, String color){
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电动车通过电机驱动行驶");
    }

    @Override
    public void power() {
        System.out.println("电动车使用电力提供动力");
    }
}