package thread.atguigu02.method_lifecycle;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-18 23:14
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber t1 = new PrintNumber("线程1");
        t1.setName("子线程1");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" +
                        Thread.currentThread().getPriority() + ":" + i);
            }

//            if(i == 20){
//                try {
//                    t1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

        }

        System.out.println("子线程1是否存活？" + t1.isAlive());
    }
}


class PrintNumber extends Thread{

    public PrintNumber(){

    }
    public PrintNumber(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" +
                        Thread.currentThread().getPriority() + ":" + i);
            }

            if(i % 20 == 0){
                Thread.yield();
            }
        }
    }
}