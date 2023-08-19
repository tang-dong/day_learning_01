package thread.atguigu02.method_lifecycle.exer;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-18 23:28
 */
public class Exer1 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i > 0){
                System.out.println(i);
            }else {
                System.out.println("Happy New Year!");
            }
        }
    }
}