package ddl.atguigu04.override.exer2;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-16 22:14
 */
public class OverrideTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.2);
        cylinder.setLength(1.4);

        System.out.println("圆柱的体积为：" + cylinder.findVolume() + "\t圆柱的表面积：" + cylinder.findArea());

    }


}