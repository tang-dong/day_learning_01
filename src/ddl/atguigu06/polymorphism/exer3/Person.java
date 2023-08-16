package ddl.atguigu06.polymorphism.exer3;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-16 23:49
 */
public class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }

    public void eat() {
    }
}