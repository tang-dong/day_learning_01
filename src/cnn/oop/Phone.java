package cnn.oop;


public class Phone {
    String name;
    double price;

    public void call(){
        System.out.println("手机能拨打电话");
    }

    public void sendMessage(String message){
        System.out.println("发送信息：" + message);
    }

    public Phone() {

    }

    public Phone(String name, double price){
        this.name = name;
        this.price = price;
    }
}
