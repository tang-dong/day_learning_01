package oop.atguigu08._interface.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 23:06
 */
public class Chinese implements Eatable{
    @Override
    public void eat() {
        System.out.println("中国人使用筷子吃饭");
    }
}