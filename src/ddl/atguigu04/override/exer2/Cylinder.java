package ddl.atguigu04.override.exer2;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-16 22:17
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        length = 1.0;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double findVolume() {
        //return super.findArea() * length;
        return Math.PI * getRadius() * getRadius() * length;
    }
    //求表面积
    @Override
    public double findArea(){
        return 3.14 * getRadius() * getRadius() * 2 +
                2 * 3.14 * getRadius() * getLength();
    }
}