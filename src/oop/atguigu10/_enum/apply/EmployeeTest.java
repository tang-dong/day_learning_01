package oop.atguigu10._enum.apply;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-18 0:16
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom",21,Status.BUSY);
        System.out.println(e1);
    }
}