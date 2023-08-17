package oop.atguigu07._abstract.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 21:45
 */
public class Circle extends GeometricObject{
    private double radius; //半径

    public Circle(String color, double weight, double radius){
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
