package oop.atguigu07._abstract.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 21:47
 */
public class MyRectangle extends GeometricObject{
    private double width;//宽
    private double height;//高

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {

        return width * height;
    }
}