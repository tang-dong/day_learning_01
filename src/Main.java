/**
 * @author Jack Tang
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
//        int i = -1;
//        System.out.println("初始数据：" + i);
//        System.out.println("初始数据对应的二进制字符串：" + Integer.toBinaryString(i));
//        i <<= 10;
//        System.out.println("左移 10 位后的数据 " + i);
//        System.out.println("左移 10 位后的数据对应的二进制字符 " + Integer.toBinaryString(i));
        boolean flag = false;
        for(int i = 0; i <= 3; i++)
        {
            if (i == 0){
                System.out.println("0");
            }else if (i == 1) {
                System.out.println("1");
                continue;
            }else if (i == 2) {
                System.out.println("2");
                flag = true;
            }else if (i == 3) {
                System.out.println("3");
                break;
            }else if (i == 4) {
                System.out.println("4");
            }
            System.out.println("xixi");
        }
        if (flag){
            System.out.println("haha");
            return;
        }
        System.out.println("heihei");

    }
}