package cnn.field_method.field.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-15 2:04
 */
public class Employee {
    String id;
    String name;
    int age;
    double salary;

    public Employee(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "员工"+id+"的编号：" + id + "\t姓名：" + name + "\t年龄：" + age + "\t薪资：" + salary;
    }
}