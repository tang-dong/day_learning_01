package cnn.oop;


public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("苹果",6999.99);
        Phone p2 = new Phone();
        p2.name = "华为";
        p2.price = 5499.99;

        System.out.println("手机品牌：" + p1.name + "\t价格：" + p1.price);
        System.out.println("手机品牌：" + p2.name + "\t价格：" + p2.price);

        p1.call();
        p2.sendMessage("你好！");

    }
}
