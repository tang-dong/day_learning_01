package thread.atguigu03.threadsafe.threadsafe;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-19 0:02
 */

class SaleTicket extends Thread{

    static int ticket = 100;

    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //synchronized (this) { //this:此时表示s1,s2,s3。不能保证锁的唯一性。
            //synchronized (obj){ //obj使用static以后就能保证其线程的唯一性
            synchronized (SaleTicket.class) { // 结构：Class clz = SaleTicket.class，是唯一的。
                if (ticket > 0 ) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                }
            }

        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        SaleTicket s1 = new SaleTicket();
        SaleTicket s2 = new SaleTicket();
        SaleTicket s3 = new SaleTicket();


        s1.setName("窗口1");
        s2.setName("窗口2");
        s3.setName("窗口3");

        s1.start();
        s2.start();
        s3.start();


    }
}