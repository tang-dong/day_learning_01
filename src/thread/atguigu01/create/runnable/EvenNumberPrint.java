package thread.atguigu01.create.runnable;

/**
 *
 * ① 创建一个实现Runnable接口的类
 * ② 实现接口中的run() -->将此线程要执行的操作，声明在此方法体中
 * ③ 创建当前实现类的对象
 * ④ 将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例
 * ⑤ Thread类的实例调用start():1.启动线程 2.调用当前线程的run()
 * @author Jack Tang
 * @description
 * @create 2023-08-18 22:20
 */

// ① 创建一个实现Runnable接口的类
class EvenNumberPrintTest implements Runnable {
    // ② 实现接口中的run() -->将此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
public class EvenNumberPrint{
    public static void main(String[] args) {
        //③ 创建当前实现类的对象
        EvenNumberPrintTest e = new EvenNumberPrintTest();

        //④ 将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例
        Thread t1 = new Thread(e);

        //⑤ Thread类的实例调用start():1.启动线程 2.调用当前线程的run()
        t1.start();

        //main()方法对应的主线程执行的操作：
        for(int i = 1;i <= 100;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

        /*
         * 拓展：再创建一个线程，用于遍历100以内的偶数
         *
         * */
        Thread t2 = new Thread(e);
        t2.start();

    }
}

