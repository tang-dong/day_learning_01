package oop.atguigu08._interface.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 23:06
 */
public class American implements Eatable{
    @Override
    public void eat() {
        System.out.println("美国人使用刀叉吃饭");
    }
}