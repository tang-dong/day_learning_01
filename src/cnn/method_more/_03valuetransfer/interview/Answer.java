package cnn.method_more._03valuetransfer.interview;

import java.io.PrintStream;


public class Answer {
    //法一：
    public static void method1(int a, int b) {
        // 在不改变原本题目的前提下，如何写这个函数才能在main函数中输出a=100，b=200？
        a = a * 10;
        b = b * 20;
        System.out.println(a);
        System.out.println(b);
        //直接退出
        System.exit(0);
    }

    //法二：
    public static void method2(int a, int b) {
        //将println重载
        PrintStream ps = new PrintStream(System.out) {
            @Override
            public void println(String x) {

                if ("a=10".equals(x)) {
                    x = "a=100";
                } else if ("b=10".equals(x)) {
                    x = "b=200";
                }
                super.println(x);
            }
        };

        System.setOut(ps);

    }

}
