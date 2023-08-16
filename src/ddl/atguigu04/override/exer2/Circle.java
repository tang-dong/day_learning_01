package ddl.atguigu04.override.exer2;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-16 22:14
 */
public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }


}