package oop.atguigu08._interface.exer3;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 23:20
 */
public class Developer {
    private String name;

    private int age;

    public Developer(){

    }

    public Developer(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void takingVehicle(Vehicle vehicle){
        vehicle.run();
    }
}