package cnn.method_more._04recursion.exer1;

import org.junit.Test;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-15 21:03
 */
public class Rescursion {

    public int f(int n){
        if (n == 20){
            return 1;
        }else if (n == 21){
            return 4;
        }else {
            return f(n+2) - 2*f(n+1);
            //错误的,StackOverflowError,会不停的陷入死循环
            //return 2*f(n-1) + f(n-2);
        }
    }

    public int f1(int n) {
        if (n == 0){
            return 1;
        }else if (n == 1){
            return 4;
        }else {
            return 2*f1(n-1) + f1(n-2);
        }
    }


    @Test
    public void test01(){
        int num = f(10);
        System.out.println(num);
    }

    @Test
    public void test02() {
        int num = f1(10);
        System.out.println(num);
    }
}