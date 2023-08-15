package cnn.encapsulation;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-15 21:56
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.name = "金蟾";

        animal.setLegs(6);
        animal.setLegs(-2);

        System.out.println("name = " + animal.name + ", legs = " + animal.getLegs());
    }
}

class Animal{
    //属性
    String name;
    private int legs; //腿的个数

    public void setLegs(int l){
        if (l >= 0 && l % 2 == 0){
            legs = l;
        }else {
            System.out.println("你输入的数据非法");
        }
    }

    public int getLegs() {
        return legs;
    }
}