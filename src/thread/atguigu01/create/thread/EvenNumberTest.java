package thread.atguigu01.create.thread;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-18 21:27
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        //3.创建当前Thread的子类的对象
        PrintNumber t1 = new PrintNumber();

        //4.通过对象调用start()
        t1.start();

        /*
         * 问题1：能否使用t1.run()替换t1.start()的调用，实现分线程的创建和调用? 不能！
         *
         * */
//        t1.run();

        /*
         * 问题2：再提供一个分线程，用于100以内偶数的遍历。
         *
         * 注意：不能让已经start()的线程，再次执行start(),否则报异常IllegalThreadStateException
         * */
//        t1.start();
        PrintNumber t2 = new PrintNumber();
        t2.start();
    }
}

//1.创建一个继承于Thread类的子类
class PrintNumber extends Thread{
    //2.重写Thread类的run() ----> 将此线程要执行的操作，声明在此方法中

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
