package thread.atguigu04.threadsafemore.singleton;

/**
 * @author Jack Tang
 * @description 实现线程安全的懒汉式
 * @create 2023-08-19 16:27
 */
public class BankTest {

    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }

}

class Bank{

    private Bank(){}

    private static volatile Bank instance = null;

    //实现线程安全的方式1：同步监视器，默认为Bank.class
//    public static synchronized Bank getInstance() {
//        if (instance == null) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            instance = new Bank();
//        }
//        return instance;
//    }

    //实现线程安全的方式2
//    public static Bank getInstance() {
//        synchronized (Bank.class) {
//            if (instance == null) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                instance = new Bank();
//            }
//        }
//        return instance;
//    }

    //实现线程安全的方式3:相较于方式1和方式2来讲，效率更高。为了避免出现指令重排，需要将instance声明为volatile
    public static Bank getInstance() {
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}