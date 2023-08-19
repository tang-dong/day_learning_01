package thread.atguigu03.threadsafe.runnablesafe;

/**
 * @author Jack Tang
 * @description  Runnable接口实现多线程  ----> 存在线程安全问题
 *               同时使用代码块解决上述卖票中的线程安全问题
 * @create 2023-08-19 13:15
 */
class SaleTicket implements Runnable{
    int ticket = 100;
    Object obj = new Object();

    Dog dog = new Dog();

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (this){ //this:是唯一的？yes，this就是当前的对象，就是题目中的 s 对象
                if (ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }

        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        SaleTicket s = new SaleTicket();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}

class Dog {

}