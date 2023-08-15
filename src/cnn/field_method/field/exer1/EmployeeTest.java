package cnn.field_method.field.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-15 2:06
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("1","张三",23,10000.0);
        Employee employee2 = new Employee("2","李四",22,11000.0);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}