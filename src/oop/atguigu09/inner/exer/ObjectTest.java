package oop.atguigu09.inner.exer;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-18 0:09
 */
public class ObjectTest {
    public static void main(String[] args) {
        //提供有一个继承于Object的匿名子类的匿名对象
        new Object(){
            public void test(){
                System.out.println("尚硅谷");
            }
        }.test();
    }
}

class SubObject extends Object{
    public void test(){
        System.out.println("尚硅谷");
    }
}