package oop.atguigu04.block;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 17:58
 */
public class BlockTest {
    public static void main(String[] args) {
        System.out.println(Person.info); //调用这个之前调用的是 静态的代码块
        System.out.println(Person.info);


        Person p1 = new Person(); //创建这个的时候是调用非静态代码块
        Person p2 = new Person();
        System.out.println(p1.age);//1
//        p1.eat();
    }
}

class Person{
    String name;
    int age;

    static String info = "我是人";

    public void eat(){
        System.out.println("人吃饭");
    }

    public Person(){

    }

    //非静态代码块
    {
        System.out.println("非静态代码块2");
    }

    {
        System.out.println("非静态代码块1");
        age = 1;
        System.out.println("info = " + info);
    }

    //静态代码块
    static{
        System.out.println("静态代码块2");
        //age = 1; //该内部只能调用静态结构
    }

    static{
        System.out.println("静态代码块1");
        System.out.println("info = " + info);
//        System.out.println("age = " + age);
//        eat();
    }
}