package thread.atguigu01.create.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-18 22:11
 */
public class Exer1 {
    public static void main(String[] args) {
//        PrintNum1 t1 = new PrintNum1();
//        t1.start();
//
//        PrintNum2 t2 = new PrintNum2();
//        t2.start();

        //方式2：创建Thread类的匿名子类的匿名对象
        new Thread(){
            public void run() {
                for (int i = 1; i <= 100; i++){
                    if (i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                for (int i = 1; i <= 100; i++){
                    if (i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

        //方式3：
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++){
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ":"+i);
                    }
                }
            }
        }).start();
    }

}

class PrintNum1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }


}

class PrintNum2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }

}