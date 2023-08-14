package com.atguigu3.common_algorithm.exer1;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-14 14:03
 */

//案例：定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，总和，平均值，
//        并输出出来。
//
//        要求：所有随机数都是两位数：[10,99]
//        提示：求[a,b]范围内的随机数： (int)(Math.random() * (b - a + 1)) + a;
public class Array_al_exer1 {
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        int total = 0;
        int min = 100;
        int max = 0;
        for (int i = 0; i < 10; i++)
        {
            arr[i] = (int)(Math.random() * (99 - 10 + 1)) + 10;  //设置随机数范围在[10,99]
            total += arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("最大值：" + max + "\t最小值：" + min + "\t总和：" + total + "\t平均值：" + total/10.0);

    }
}