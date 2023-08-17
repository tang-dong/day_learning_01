package ddl.atguigu07.object.tostring.exer;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 15:19
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

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

    //求圆的面积
    public double findArea(){
        return Math.PI * radius * radius;
    }

    //重写equals()
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof Circle){
            Circle c = (Circle) o;
            return this.radius == c.radius;
        }

        return false;
    }

    // 重写toString()
    @Override
    public String toString() {
        return "Circle[radius = " + radius + "]";
    }

}