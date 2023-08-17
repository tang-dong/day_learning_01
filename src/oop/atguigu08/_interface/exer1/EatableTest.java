package oop.atguigu08._interface.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-17 23:12
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[3];

        eatables[0] = new Chinese();
        eatables[1] = new American();
        eatables[2] = new Indian();

        for (int i = 0; i < eatables.length; i++){
            eatables[i].eat();
        }
    }
}