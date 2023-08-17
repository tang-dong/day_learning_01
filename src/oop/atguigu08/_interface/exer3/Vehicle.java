package oop.atguigu08._interface.exer3;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 23:22
 */
public abstract class Vehicle{
    private String brand;
    private String color;

    public Vehicle(){

    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public abstract void run();
}