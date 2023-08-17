package oop.atguigu05.field.interview;


public class Test03 {
    public static void main(String[] args) {
        //先调用 Base 中的非静态代码块，再调用Base构造函数，直接调用sub.method(100)方法，后面再调用Sub中的非静态代码块
        //再调用Sub中的method方法
        Sub s = new Sub();
    }
}
class Base{
    Base(){
        method(100);
    }
    {
        System.out.println("base");
    }
    public void method(int i){
        System.out.println("base : " + i);
    }
}
class Sub extends Base{
    Sub(){
        super.method(70);
    }
    {
        System.out.println("sub");
    }
    public void method(int j){
        System.out.println("sub : " + j);
    }
}
